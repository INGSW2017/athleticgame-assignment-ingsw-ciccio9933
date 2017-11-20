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
		game.addArrival("Elio", Instant.now().minusSeconds(33));
		game.addArrival("Fabio", Instant.now().minusSeconds(35));
		assertEquals("Fabio", game.getWinner());
	}
	@Test(timeout = 1000)
	public void testSleep()
	{
		try
		{
			Thread.sleep(1010);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		game.addArrival("Elio", Instant.now().minusSeconds(33));
		game.addArrival("Fabio", Instant.now().minusSeconds(35));
		assertEquals("Fabio", game.getWinner());
	}
}