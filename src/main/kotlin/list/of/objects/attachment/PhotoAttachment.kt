package list.of.objects.attachment

import Attachment

data class PhotoAttachment(
    override val type: String = "photo",
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
) : Attachment("photo")
