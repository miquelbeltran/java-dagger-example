import dagger.Module;
import dagger.Provides;

@Module
public class GameModule {

		@Provides
		GameData providesGameData() {
				return new GameData();
		}
}
