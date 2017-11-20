package it.unical.test;
import static org.junit.Assert.assertEquals;
import java.time.Instant;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import it.unical.asde.AthleticGame;
public class AthleticGameWinnersTest
{
	private static AthleticGame game;
	@BeforeClass
	public static void init()
	{
		game = new AthleticGame("Boccie");
	}
	@After
	public void reset()
	{
		game.reset();
	}
	@Before
	public void start()
	{
		game.start();
	}
	@Test
	public void testWinnerFabio()
	{
		game.addArrival("Elio", Instant.now());
		game.addArrival("Fabio", Instant.now());
		assertEquals("Fabio", game.getWinner());
	}
}