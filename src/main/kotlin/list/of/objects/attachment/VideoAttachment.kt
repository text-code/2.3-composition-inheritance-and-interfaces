package list.of.objects.attachment

import Attachment

data class VideoAttachment(
    val id: Int,
    val videoUrl: String,
) : Attachment("Video")