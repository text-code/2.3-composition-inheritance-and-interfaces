import org.junit.After
import org.junit.Assert.*
import org.junit.Test
import java.util.*

class WallServiceTest {
    @Test
    fun id_must_not_be_0() {
        // arrange
        val post = Post(
            0,
            1,
            1,
            1,
            1,
            "",
            1,
            1,
            false,
            null,
            null,
            null,
            null,
            null,
            "",
            null,
            1,
            false,
            false,
            false,
            1,
            false,
            false,
            null,
            1
        )
        val expectedPostId = 0
        // act
        val actualPostId = WallService.add(post)
        // assert
        assertNotEquals(expectedPostId, actualPostId.id)
    }

    @Test
    fun updating_an_existing_post() {
        // arrange
        WallService.add(
            Post(
                0,
                1,
                1,
                1,
                1,
                "",
                1,
                1,
                false,
                null,
                null,
                null,
                null,
                null,
                "",
                null,
                1,
                false,
                false,
                false,
                1,
                false,
                false,
                null,
                1
            )
        )
        val postUpdate = Post(
            1,
            1,
            1,
            1,
            1,
            "",
            1,
            1,
            false,
            null,
            null,
            null,
            null,
            null,
            "",
            null,
            1,
            false,
            false,
            false,
            1,
            false,
            false,
            null,
            1
        )
        // act
        val actualUpdatePost = WallService.update(postUpdate)
        // assert
        assertTrue(actualUpdatePost)
    }

    @Test
    fun update_a_nonexistent_post() {
        // arrange
        val postUpdate = Post(
            2,
            1,
            1,
            1,
            1,
            "",
            1,
            1,
            false,
            null,
            null,
            null,
            null,
            null,
            "",
            null,
            1,
            false,
            false,
            false,
            1,
            false,
            false,
            null,
            1
        )
        val expectedUpdatePost = false
        // act
        val actualUpdatePost = WallService.update(postUpdate)
        // assert
        assertEquals(expectedUpdatePost, actualUpdatePost)
    }
}