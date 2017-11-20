package it.unical.test;
import static org.junit.Assert.assertEquals;
import java.time.Instant;
import org.junit.BeforeClass;
import org.junit.Test;
import it.unical.asde.AthleticGame;
public class AthleticGameBasicTest
{
	protected static AthleticGame game;
	@BeforeClass
	public static void init()
	{
		game = new AthleticGame("Bocce");
	}
	@Test
	public void testAddArrival()
	{
		game.addArrival("Fabio", Instant.now());
		assertEquals(1, game.getArrivals().size());
	}
	@Test(expected = IllegalArgumentException.class) // verifico che ci sia l'eccezzione e la catturo e ma cnservu ndru stipu
	public void testGetParecipiantTime()
	{
		game.getParecipiantTime("Miaooo");
	}
}
