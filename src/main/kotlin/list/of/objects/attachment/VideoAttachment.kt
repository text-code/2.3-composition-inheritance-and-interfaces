package list.of.objects.attachment

import Attachment

data class VideoAttachment(
    override val type: String = "video",
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
) : Attachment("video")