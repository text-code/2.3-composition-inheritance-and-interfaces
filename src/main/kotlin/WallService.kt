import list.of.objects.attachment.*

object WallService {
    private var posts = emptyArray<Post>()
    private var listId: Int = 0

    fun add(post: Post): Post {
        listId++
        val postId = post.copy(id = listId)
        posts += postId
        return posts.last()
    }

    fun update(postUpdate: Post): Boolean {
        for (post in posts) {
            if (postUpdate.id == post.id) {
                val newPost = postUpdate.copy(ownerId = post.ownerId, date = post.date)
                posts[post.id - 1] = newPost
                posts.forEach { i -> println(i) }
                return true
            } else if (postUpdate.id >= posts.size) {
                return false
            }
        }
        return false
    }

    fun showAttachment(attachment: Attachment) {
        when (attachment.type) {
            "Photo" -> (attachment as PhotoAttachment).photoUrl
            "Video" -> (attachment as VideoAttachment).videoUrl
        }
    }
}