package demo;

import java.awt.Color;

import static demo.TextContainer.*;

public class DEMO extends engine.Project
{	
	/*--------------------
		Constants
	--------------------*/	
	
	//---- Colors --------
	
	private static final Color SCENE_TEXT_COLOR = DEFAULT_COLOR;
	private static final Color BATTLE_TEXT_COLOR = DEFAULT_COLOR;
	private static final Color DISABLED_TEXT_COLOR = Color.GRAY;
	private static final Color DIALOGUE_TEXT_COLOR = DEFAULT_COLOR;
	private static final Color CREDITS_TEXT_COLOR = DEFAULT_COLOR;
	
	//---- Music ---------
	
	private static final int TRACK_ESTATE = 1;
	private static final int TRACK_TOWAMAGAS_AMBITION = 2;
	private static final int TRACK_VICTORY = 3;
	private static final int TRACK_DEFEAT = 4;
	private static final int TRACK_DUEL = 5;
	private static final int TRACK_END = 6;
	
	//---- Sounds --------
	
	private static final int SFX_NOPE = 1;
	
	//---- Abilities -----
	
	private static final int ATK_DEFAULT = 1;
	private static final int ATK_SHURIKEN = 2;
	private static final int HEAL_SAKE = 3;
	private static final int HEAL_RICE = 4;
	private static final int HEAL_SUSHI = 5;
	private static final int HEAL_DEFAULT = 6;
	private static final int HEAL_GREAT = 7;
	private static final int ATK_CUTS = 8;
	private static final int ATK_SHIZAN = 9;
	private static final int ATK_KESAGAKE = 10;
	private static final int ATK_WRATH = 11;
	private static final int ATK_STRONG = 12;
	private static final int ATK_CLAWS = 13;
	
	//---- NPCs ----------
	
	private static final int HIRO = 31;
	private static final int TOWAMAGA = 2;
	
	private static final int HIRO_HP = 200;
	private static final int TOWAMAGA_HP = 2000;
	
	//---- Backgrounds ---
	
	private static final int ARENA_BG = 1;
	private static final int ARENA_HUD = 2;
	private static final int PALACE = 3;
	private static final int SUNRISE = 4;
	private static final int TABLE_KATANA = 5;
	
	//---- Dialogues -----
	
	private static final int DIA_BEGIN = 1;
	private static final int DIA_VICTORY = 2;
	private static final int DIA_LOSE = 3;
	private static final int DIA_LAST = 4;
	
	//---- Battlefields --
	
	private static final int ARENA = 1;
	
	//---- Scenes --
	
	private static final int SCENE_LOGO = 0;
	private static final int SCENE_PRE_INTRO = 1;
	private static final int SCENE_INTRO = 2;
	private static final int SCENE_POST_INTRO = 3;
	private static final int SCENE_BEGIN = 4;
	private static final int SCENE_PRE_FIGHT = 5;
	private static final int SCENE_FIGHT = 6;
	private static final int SCENE_LOSE = 7;
	private static final int SCENE_TRY_AGAIN = 8;
	private static final int SCENE_LOSE_JUMP = 9;
	private static final int SCENE_VICTORY = 10;
	private static final int SCENE_DEMO_END = 11;
	private static final int SCENE_CREDITS = 12;
	private static final int SCENE_DIA_LAST = 13;	
	private static final int SCENE_PRE_EXIT = 14;
	private static final int SCENE_EXIT = 15;
	
	//---- Textures ------
	
	private static final int TEX_LOGO = 31;
	
	private static final int TEX_HIRO = 16;
	private static final int TEX_HIRO_P = 10;
	private static final int TEX_HIRO_HURT = TEX_HIRO;
	private static final int TEX_HIRO_HURT_P = 11;
	private static final int TEX_HIRO_AGONY = 17;
	private static final int TEX_HIRO_AGONY_P = 12;
	
	private static final int TEX_TOWAMAGA = 13;
	private static final int TEX_TOWAMAGA_P = 7;
	private static final int TEX_TOWAMAGA_HURT = TEX_TOWAMAGA;
	private static final int TEX_TOWAMAGA_HURT_P = 8;
	private static final int TEX_TOWAMAGA_AGONY = 15;
	private static final int TEX_TOWAMAGA_AGONY_P = 9;
	private static final int TEX_TOWAMAGA_ANGRY = 14;
	private static final int TEX_TOWAMAGA_ANGRY_P = TEX_TOWAMAGA_P;
	
	private static final int TEX_ARENA_BG = 2;
	private static final int TEX_ARENA_HUD = 3;
	private static final int TEX_DIA_BG = 1;
	private static final int TEX_PALACE = 4;
	private static final int TEX_SUNRISE = 5;
	private static final int TEX_TABLE_KATANA = 6;
	
	private static final int TEX_SAKE = 18;
	private static final int TEX_ATK_DEFAULT = 19;
	private static final int TEX_SHURIKEN = 20;
	private static final int TEX_RICE = 21;
	private static final int TEX_SUSHI = 22;
	private static final int TEX_HEAL = 23;
	private static final int TEX_HEAL_GREAT = 24;
	private static final int TEX_CUTS = 25;
	private static final int TEX_SHIZAN	=26;
	private static final int TEX_KESAGAKE = 27;
	private static final int TEX_WRATH = 28;
	private static final int TEX_STRONG = 29;
	private static final int TEX_CLAWS = 30;
	
	/*--------------------
		Constructor
	--------------------*/
	
	public DEMO()
	{
		super(TITLE);
	}
	
	/*--------------------
		Text
	--------------------*/

	private TextContainer vTexts;
	
	private void setLanguage()
	{
		if(this.getCustomOptionValue(0)==0)
			vTexts = new PLTextContainer();
		else
			vTexts = new ENTextContainer();
	}
	
	private String textSys(int index)
	{
		return vTexts.getSys(index);
	}
	
	private String textAbility(int index)
	{
		return vTexts.getAbility(index);
	}

	private String[] intro()
	{
		return vTexts.getIntro();
	}
	
	private String textScreen(int index)
	{
		return vTexts.getScr(index);
	}
	
	private String textDia(int index)
	{
		return vTexts.getDia(index);
	}
	
	private String textCredits(int index)
	{
		return vTexts.getCreditsText(index);
	}
	
	/*--------------------
		System
	--------------------*/
	
	@Override
	protected void selectLauncherFonts()
	{
		setLauncherTitleFont("font_1_ant-kaku.ttf",40);
		setLauncherDescriptionFont("FiraSans-Regular.otf", 14);
	}
	
	@Override
	protected void setSystemProperties()
	{		
		setLanguage();
		setExitDialog(textSys(LABEL_EXIT), textSys(BTN_YES), textSys(BTN_NO));
		setMenuWindow(textSys(LABEL_MENU), textSys(BTN_SAVE),textSys(BTN_EXIT), textSys(BTN_CONTINUE));
		setSaveWindow(textSys(LABEL_SAVE), textSys(BTN_SAVE), textSys(BTN_CANCEL), textSys(LABEL_OVERWRITE), textSys(BTN_YES), textSys(BTN_NO), textSys(BTN_OK), textSys(LABEL_SAVE_SUCCESS));
		setWarnings(textSys(WARN_EMPTY), textSys(WARN_TOO_LONG));
		
		setSceneTextColor(SCENE_TEXT_COLOR);
		setBattleTextColor(BATTLE_TEXT_COLOR);
		setDisabledTextColor(DISABLED_TEXT_COLOR);
		setDialogueTextColor(DIALOGUE_TEXT_COLOR);
		setCreditsTextProperties(CREDITS_TEXT_COLOR, 30, 40);		
	}
	
	@Override
	protected void createDescription()
	{
		setDescription(DESCRIPTION);
	}
	
	@Override
	protected void addCustomOptions()
	{
		addOption("Language", "Polski", "English");
	}
	
	/*--------------------
		Music
	--------------------*/
		
	@Override
	protected void buildTrackList()
	{
		addMusicTrack(TRACK_ESTATE, "Hashienda.ogg");
		addMusicTrack(TRACK_TOWAMAGAS_AMBITION, "TowamagaNoYabou.ogg");
		addMusicTrack(TRACK_VICTORY, "Shouri.ogg");
		addMusicTrack(TRACK_DEFEAT, "Haiboku.ogg");
		addMusicTrack(TRACK_DUEL, "Hatashiai.ogg");
		addMusicTrack(TRACK_END, "Owari.ogg");
	}
	
	/*--------------------
		SFX
	--------------------*/
	
	@Override
	protected void buildSoundsList()
	{
		addSound(SFX_NOPE, "SFX_Nope.ogg");
	}
	
	/*--------------------
		Abilities
	--------------------*/
	
	@Override
	protected void buildAbilitiesList()
	{
		//addAttack(int ID, String name, int sound, int texture, int power, int speed, int space, int size, int cost);
		
		
		//---- Hiro ----------
		addAttack(ATK_DEFAULT, textAbility(ATK_DEFAULT_NAME),NO_SOUND, TEX_ATK_DEFAULT, 20, 1, 200, 20, 1);
		addAttack(ATK_SHURIKEN, textAbility(ATK_SHURIKEN_NAME),NO_SOUND, TEX_SHURIKEN, 10, 5, 0, 1, 2);
		addAttack(ATK_STRONG, textAbility(ATK_STRONG_NAME),NO_SOUND, TEX_STRONG, 100, 2, 250, 20, 5);
		
		addHeal(HEAL_DEFAULT, textAbility(HEAL_DEFAULT_NAME),NO_SOUND, TEX_HEAL, 25, 1, 200, 25, 3);
		addHeal(HEAL_GREAT, textAbility(HEAL_GREAT_NAME),NO_SOUND, TEX_HEAL_GREAT, 100, 1, 150, 25, 10);
		
		//---- Towamaga ------
		addAttack(ATK_SHIZAN, textAbility(ATK_SHIZAN_NAME),NO_SOUND, TEX_SHIZAN, 10, 1, 200, 20, 1);
		addAttack(ATK_CUTS, textAbility(ATK_CUTS_NAME),NO_SOUND, TEX_CUTS, 50, 2, 200, 10, 5);
		addAttack(ATK_KESAGAKE, textAbility(ATK_KESAGAKE_NAME),NO_SOUND, TEX_KESAGAKE, 50, 1, 180, 25, 10);
		addAttack(ATK_WRATH, textAbility(ATK_WRATH_NAME),NO_SOUND, TEX_WRATH, 200, 2, 250, 50, 20);
		addAttack(ATK_CLAWS, textAbility(ATK_CLAWS_NAME),NO_SOUND, TEX_CLAWS, 1000, 1, 170, 50, 30);
		
		addHeal(HEAL_SAKE, textAbility(HEAL_SAKE_NAME),NO_SOUND, TEX_SAKE, 50, 4, 10, 2, 5);
		addHeal(HEAL_RICE, textAbility(HEAL_RICE_NAME),NO_SOUND, TEX_RICE, 50, 1, 200, 25, 2);
		addHeal(HEAL_SUSHI, textAbility(HEAL_SUSHI_NAME),NO_SOUND, TEX_SUSHI, 100, 1, 150, 20, 10);
		
	
	}
	
	/*--------------------
		NPCs
	--------------------*/
	
	@Override
	protected void buildNpcList()
	{
		//---- Hiro ----------
		
		addNpc
		(
			//-- ID ---------
			HIRO,
			
			//-- Name -------
			"Hiro",
			
			//---HP ---------
			HIRO_HP,
			
			//-- Portrait ---
			TEX_HIRO_P,
			
			//-- Effigy -----
			TEX_HIRO,
			
			//-- Abilities --
			ATK_DEFAULT, ATK_SHURIKEN, ATK_STRONG,
			HEAL_DEFAULT, HEAL_GREAT
		);
		
		//---- Towamaga ------
		
		addNpc
		(
			//-- ID ---------
			TOWAMAGA,
			
			//-- Name -------
			"Towamaga",
			
			//---HP ---------
			TOWAMAGA_HP,
			
			//-- Portrait ---
			TEX_TOWAMAGA_P,
			
			//-- Effigy -----
			TEX_TOWAMAGA,
			
			//-- Abilities --
			ATK_SHIZAN, ATK_CUTS, ATK_KESAGAKE, ATK_WRATH, ATK_CLAWS,
			HEAL_SAKE, HEAL_RICE, HEAL_SUSHI
		);
	}
	
	@Override
	protected void setNpcAttributes()
	{
		//---- Hiro ----------
		
		setStatusVisual(HIRO, HURT, TEX_HIRO_HURT, TEX_HIRO_HURT_P);		
		setStatusVisual(HIRO, AGONY, TEX_HIRO_AGONY, TEX_HIRO_AGONY_P);		
		
		//---- Towamaga ------
		
		setStatusVisual(TOWAMAGA, ANGRY, TEX_TOWAMAGA_ANGRY, TEX_TOWAMAGA_ANGRY_P);
		setStatusVisual(TOWAMAGA, AGONY, TEX_TOWAMAGA_AGONY, TEX_TOWAMAGA_AGONY_P);	
		setStatusVisual(TOWAMAGA, HURT, TEX_TOWAMAGA_HURT, TEX_TOWAMAGA_HURT_P);
	}
	
	/*--------------------
		Backgrounds
	--------------------*/
	
	@Override
	protected void buildBackgroundsList()
	{
		addBackground(ARENA_BG, TEX_ARENA_BG);
		addBackground(ARENA_HUD, TEX_ARENA_HUD);
		addBackground(PALACE, TEX_PALACE);
		addBackground(SUNRISE, TEX_SUNRISE);
		addBackground(TABLE_KATANA, TEX_TABLE_KATANA);
	}
	
	/*--------------------
		Dialogues
	--------------------*/
	
	@Override
	protected void buildDialoguePanel()
	{
		setDialoguePanel(TEX_DIA_BG);
	}
	
	@Override
	protected void buildDialoguesList()
	{
		//---- Begin ---------
		addDialogue
		(
			//-- ID ---------
			DIA_BEGIN,
			//-- Background--
			PALACE,
			//-- Parts ------
			part(TOWAMAGA, textDia(DIA_BEGIN_01_TOWAMAGA), ()->playMusic(TRACK_ESTATE)),
			part(TOWAMAGA, textDia(DIA_BEGIN_02_TOWAMAGA)),
			part(HIRO, textDia(DIA_BEGIN_03_HIRO)),
			part(TOWAMAGA, textDia(DIA_BEGIN_04_TOWAMAGA)),
			part(HIRO, textDia(DIA_BEGIN_05_HIRO)),
			part(HIRO, textDia(DIA_BEGIN_06_HIRO)),
			part(TOWAMAGA, textDia(DIA_BEGIN_07_TOWAMAGA)),			
			part(TOWAMAGA, textDia(DIA_BEGIN_08_TOWAMAGA), ()->playMusic(TRACK_TOWAMAGAS_AMBITION)),			
			part(HIRO, textDia(DIA_BEGIN_09_HIRO)),
			part(TOWAMAGA, textDia(DIA_BEGIN_10_TOWAMAGA), ()->{stopMusic(); playSound(SFX_NOPE);}),			
			part(TOWAMAGA, textDia(DIA_BEGIN_11_TOWAMAGA), ()->playMusic(TRACK_ESTATE)),
			part(TOWAMAGA, textDia(DIA_BEGIN_12_TOWAMAGA)),
			part(HIRO, textDia(DIA_BEGIN_13_HIRO)),
			part(HIRO, textDia(DIA_BEGIN_14_HIRO), ()->stopMusic()),
			part(TOWAMAGA, textDia(DIA_BEGIN_15_TOWAMAGA), ()->{setStatus(TOWAMAGA, ANGRY); playMusic(TRACK_DUEL);}),
			part(TOWAMAGA, textDia(DIA_BEGIN_16_TOWAMAGA))
		);		
		
		//---- Victory -------
		addDialogue
		(
			//-- ID ---------
			DIA_VICTORY,
			//-- Background--
			PALACE,
			//-- Parts ------
			part(HIRO, textDia(DIA_VICTORY_01_HIRO), ()->{setStatus(TOWAMAGA, AGONY); setStatus(HIRO, NEUTRAL);}),
			part(TOWAMAGA, textDia(DIA_VICTORY_02_TOWAMAGA)),
			part(HIRO, textDia(DIA_VICTORY_03_HIRO)),
			part(HIRO, textDia(DIA_VICTORY_04_HIRO))
		);
		
		//---- Lose ----------
		addDialogue
		(
			//-- ID ---------
			DIA_LOSE,
			//-- Background--
			PALACE,
			//-- Parts ------
			part(HIRO, textDia(DIA_LOSE_01_HIRO), ()->setStatus(HIRO, AGONY))
		);
		
		//---- Last ----------
		addDialogue
		(
			//-- ID ---------
			DIA_LAST,
			//-- Background--
			SUNRISE,
			//-- Parts ------
			part(HIRO, textDia(DIA_LAST_01_HIRO)),
			part(HIRO, textDia(DIA_LAST_02_HIRO)),
			part(HIRO, textDia(DIA_LAST_03_HIRO))
		);
	}
	
	/*--------------------
		Arenas
	--------------------*/
	
	@Override
	protected void buildArenasList()
	{
		addArena(ARENA, ARENA_BG, ARENA_HUD);
	}
	
	/*--------------------
		Credits
	--------------------*/
	
	@Override
	protected void buildGameCredits()
	{
		buildCredits
		(
			creditsSpace(200),
			creditsImage(800, 200, TEX_LOGO),
			creditsSpace(200),
			creditsLine(textCredits(CR_AME_H), textCredits(CR_AME_L1), textCredits(CR_AME_L2)),
			creditsSpace(200),
			creditsLine(textCredits(CR_AUTHOR_H),textCredits(CR_AUTHOR_L1)),
			creditsSpace(200),			
			creditsLine(textCredits(CR_LIB_H), textCredits(CR_LIB_L1), textCredits(CR_LIB_L2), textCredits(CR_LIB_L3)),
			creditsSpace(200),
			creditsLine(textCredits(CR_FNT_H), textCredits(CR_FNT_L1), textCredits(CR_FNT_L2)),
			creditsSpace(100)
		);
	}
	
	/*--------------------
		Scenario
	--------------------*/
	
	@Override
	protected void buildScenario()
	{		
		//----- (0) SCENE_LOGO ----
		addEvent(()->
		{
			playImageOnBlack(WINDOW_WIDTH, 256, TEX_LOGO);
			playMusic(TRACK_TOWAMAGAS_AMBITION);
		});	
		
		//----- (1) SCENE_PRE_INTRO ----
		addEvent(()->
		{
			playTextOnBlack(30, DEFAULT_COLOR, textScreen(SCR_PRE_INTRO));
			playMusic(TRACK_TOWAMAGAS_AMBITION);
		});	
		
		//----- (2) SCENE_INTRO --------		
		
		addEvent(()->
		{			
			playStaticScene(TABLE_KATANA, 20, 100, true, intro());
			playMusic(TRACK_TOWAMAGAS_AMBITION);
		});
		
		//----- (3) SCENE_POST_INTRO ---
		addEvent(()->
		{			
			playTextOnBlack(30, DEFAULT_COLOR, textScreen(SCR_POST_INTRO));
		});
		
		//----- (4) SCENE_BEGIN --------		
		addEvent(()->
		{
			playDialogue(DIA_BEGIN);			
		});
		
		//----- (5) SCENE_PRE_FIGHT --------
		addEvent(()->
		{			
			playTextOnBlack(30, DEFAULT_COLOR, textScreen(SCR_BATTLE_1), textScreen(SCR_BATTLE_2));
			playMusic(TRACK_DUEL);
		});
		
		//----- (6) SCENE_FIGHT --------
		addEvent(()->
		{
			fight(HIRO, TOWAMAGA, ARENA, SCENE_VICTORY, SCENE_LOSE);
			playMusic(TRACK_DUEL);
		});
		
		//----- (7) SCENE_LOSE ---------		
		addEvent(()->
		{
			playDialogue(DIA_LOSE);
			playMusic(TRACK_DEFEAT);
		});
		
		//----- (8) SCENE_TRY_AGAIN ----
		addEvent(()->
		{
			playMusic(TRACK_DEFEAT);
			playTextOnBlack(30, DEFAULT_COLOR, textScreen(SCR_TRY_AGAIN));
			setStatus(HIRO, NEUTRAL);
			setStatus(TOWAMAGA, NEUTRAL);
		});
		
		//----- (9) SCENE_LOSE_JUMP ----
		addEvent(()->
		{
			jump(SCENE_PRE_FIGHT);
		});		
		
		//----- (10) SCENE_VICTORY ------
		addEvent(()->
		{
			playMusic(TRACK_VICTORY);
			playDialogue(DIA_VICTORY);			
		});
		
		//----- (11) SCENE_DEMO_END -----
		addEvent(()->
		{			
			playTextOnBlack(30, DEFAULT_COLOR, textScreen(SCR_END));
		});
		
		//----- (12) SCENE_CREDITS -----
		addEvent(()->
		{
			playCredits();
			playMusic(TRACK_END);
		});
		
		//----- (13) SCENE_DIA_LAST ----
		addEvent(()->
		{
			stopMusic();
			playDialogue(DIA_LAST);
		});			
		
		//----- (14) SCENE_PRE_EXIT ----
		addEvent(()->
		{
			playTextOnBlack(30, DEFAULT_COLOR, textScreen(SCR_PRESS_TO_EXIT));
		});
		
		//----- (15) SCENE_EXIT --------
		addEvent(()->
		{
			exit();
		});
	}
}
