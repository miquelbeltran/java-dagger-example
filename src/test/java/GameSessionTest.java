import org.junit.Test;
import static org.junit.Assert.*;

public class GameSessionTest {
		@Test
		public void testGameSession() {
				GameSession session = new GameSession(new GameData());
				assertEquals("Hello Dagger", session.data.hello);
		}
}
