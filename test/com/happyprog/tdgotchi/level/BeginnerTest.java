package com.happyprog.tdgotchi.level;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.happyprog.tdgotchi.scoreboard.MoodManager;

public class BeginnerTest {

	private MoodManager moodManager;
	private Beginner level;

	@Before
	public void before() {
		moodManager = mock(MoodManager.class);
		level = new Beginner(moodManager);
	}

	@Test
	public void getNormalMood_loadsMoodFromManager() throws Exception {
		level.getNormalMood();

		verify(moodManager).getNormalMoodForLevel(MoodManager.Level.Beginner);
	}

	@Test
	public void getHappyMood_loadsMoodForManager() throws Exception {
		level.getHappyMood();

		verify(moodManager).getHappyMoodForLevel(MoodManager.Level.Beginner);
	}

	@Test
	public void getUpsetMood_loadsMoodForManager() throws Exception {
		level.getUpsetMood();

		verify(moodManager).getUpsetMoodForLevel(MoodManager.Level.Beginner);
	}

	@Test
	public void getHealth_loadsHealthFromManager() throws Exception {
		level.getHealth();

		verify(moodManager).getHealthForLevel(MoodManager.Level.Beginner);
	}
}
