package list.of.objects.attachment

import Attachment

data class PhotoAttachment(
    val id: Int,
    val photoUrl: String,
) : Attachment("Photo")
