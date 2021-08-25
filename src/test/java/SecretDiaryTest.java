import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecretDiaryTest {
    @Test
    void refusesToReadWhenLocked() {
        MockDiary mockDiary = new MockDiary();
        SecretDiary secretDiary = new SecretDiary(mockDiary);
        assertEquals("Go away!", secretDiary.read());
        assertEquals(false, mockDiary.iGotCalled);
    }

    @Test
    void readsWhenUnlocked() {
        MockDiary mockDiary = new MockDiary();
        SecretDiary secretDiary = new SecretDiary(mockDiary);
        secretDiary.unlock();
        assertEquals("You've successfully called through to MockDiary!", secretDiary.read());
        assertEquals(true, mockDiary.iGotCalled);
    }

    private class MockDiary implements IDiary {
        public Boolean iGotCalled = false;

        public String read() {
            iGotCalled = true;
            return "You've successfully called through to MockDiary!";
        }
    }
}
