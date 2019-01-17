package demo;

public class ENTextContainer extends TextContainer
{
	ENTextContainer()
	{
		super();
		setSysTextArr(vSysEn);
		setAbilitiesTextArr(vAbilitiesEn);
		setIntro(vIntroEn);
		setScrTextArr(vScrEn);
		setDiaTextArr(vDiaEn);
		setCreditsTextArr(vCreditsEn);
	}
	
	private String[] vSysEn = new String[]
	{
		/* LABEL_EXIT */			"Do you really wanna exit game?",
		/* LABEL_SAVE */			"Save as:",
		/* LABEL_OVERWRITE */		"Save exists! Overwrite?",
		/* LABEL_MENU */			"What do you want to do?",
		/* LABEL_SAVE_SUCCESS */	"Game saved!",
		/* WARN_EMPTY */			"File name cannot be empty!",
		/* WARN_TOO_LONG */			"File name too long!",
		/* BTN_YES */				"Yes",
		/* BTN_NO */				"No",
		/* BTN_SAVE */				"Save",
		/* BTN_CANCEL */			"Cancel",
		/* BTN_OK */				"OK",
		/* BTN_EXIT */				"Exit game",
		/* BTN_CONTINUE */			"Continue"
	};
	
	private String[] vAbilitiesEn = new String[]
	{
		/* ATK_DEFAULT_NAME */		"Standard attack",
		/* ATK_SHURIKEN_NAME */		"Shuriken throw",
		/* ATK_STRONG_NAME */		"Strong attack",
		/* ATK_CUTS_NAME */			"Fast cuts",
		/* ATK_SHIZAN_NAME */		"Tameshigiri",
		/* ATK_KESAGAKE_NAME */		"Kesagake",
		/* ATK_WRATH_NAME */		"Towamaga's wrath",
		/* ATK_CLAWS_NAME */		"Oni's claws",
		/* HEAL_DEFAULT_NAME */		"Curing",
		/* HEAL_GREAT_NAME */		"Healing",
		/* HEAL_RICE_NAME */		"Portion of rice",
		/* HEAL_SAKE_NAME */		"One sip of sake",
		/* HEAL_SUSHI_NAME */		"Strengthening sushi"
	};
	
	private String[] vCreditsEn = new String[]
	{
		/* CR_AME_H */		"",
		/* CR_AME_L1 */		"It was a demonstration of",
		/* CR_AME_L2 */		"the possibilities of AmeEnjin v0.2",
		/* CR_AUTHOR_H */	"Project and realisation",
		/* CR_AUTHOR_L1 */	"Arkadiusz Kostyra",
		/* CR_LIB_H */		"AmeEnjin v0.2 uses libraries:",
		/* CR_LIB_L1 */		"LWJGL 2 (BSD license)",
		/* CR_LIB_L2 */		"Slick-Util (BSD license)",
		/* CR_LIB_L3 */		"uJavniacz (MIT license)",
		/* CR_FNT_H */		"Used fonts:",
		/* CR_FNT_L1 */		"Fira Sans",
		/* CR_FNT_L2 */		"Honoka Antique Kaku"
	};
	
	private String[] vIntroEn = new String[]
	{
		"Local conflicts, clans quarrels, endless fight for domination...",
		"One great warrior, Mr. Towamaga, decides to end this.",
		"After long struggles he managed to subjugate the entire land.",
		"Next years of his despotic reign, allowed him to ultimately crush any resistance.",
		"Under rule of the cruel tyrant, a long-awaited peace has come to this land."
	};
	
	private String[] vScrEn = new String[]
	{
		/* SCR_PRE_INTRO */			"It was not peaceful times...",
		/* SCR_POST_INTRO */		"Until that day...",
		
		/* SCR_TRY_AGAIN */			"Press ENTER to try again",
		/* SCR_END */				"The end of DEMO version",
		/* SCR_PRESS_TO_EXIT */		"Press ENTER to end the game",
		/* SCR_BATTLE_1 */			"Battle begins!",
		/* SCR_BATTLE_2 */			"Press ENTER, when you're ready"
	};
	
	private String[] vDiaEn = new String[]
	{
		/* DIA_BEGIN_01_TOWAMAGA */		"Ah, what a wonderful day!",
		/* DIA_BEGIN_02_TOWAMAGA */		"I love such peaceful days, when nothing happens!",
		/* DIA_BEGIN_03_HIRO */			"Beware, Towamaga! Your reign ends today!",
		/* DIA_BEGIN_04_TOWAMAGA */		"What? Who are you? And by what right do you disturb my peace?",
		/* DIA_BEGIN_05_HIRO */			"I am Hiro of Ainide clan! I come to challenge you!",
		/* DIA_BEGIN_06_HIRO */			"I will defeat you! I'll return freedom to this land and do, what my father didn't manage many years ago!", 
		/* DIA_BEGIN_07_TOWAMAGA */		"Ah, young Hiro... You don't understand!",
		/* DIA_BEGIN_08_TOWAMAGA */		"I am your father!",
		/* DIA_BEGIN_09_HIRO */			"...is that truth...?",
		/* DIA_BEGIN_10_TOWAMAGA */		"No.",
		/* DIA_BEGIN_11_TOWAMAGA */		"Ha ha! It's so easy to distract you!",		
		/* DIA_BEGIN_12_TOWAMAGA */		"You are not ready to fight me! Begone!",
		/* DIA_BEGIN_13_HIRO */			"And you...",
		/* DIA_BEGIN_14_HIRO */			"... are STUPID!",
		/* DIA_BEGIN_15_TOWAMAGA */		"How dare you insult me such?!",
		/* DIA_BEGIN_16_TOWAMAGA */		"That insolence deserve a punishment! DIE!!!",
		
		/* DIA_LOSE_01_HIRO */			"I was defeated... Everything lost...",
		
		/* DIA_VICTORY_01_HIRO */		"It's over, Towamaga! You're finished!",
		/* DIA_VICTORY_02_TOWAMAGA */	"How could I lose? It cannot be true!",
		/* DIA_VICTORY_03_HIRO */		"I did it! I free this land from cruel tyrant!",
		/* DIA_VICTORY_04_HIRO */		"I think I deserve a moment of rest...",
		
		/* DIA_LAST_01_HIRO */			"And so evil was defeated...",
		/* DIA_LAST_02_HIRO */			"So many years of trainings and sacrifices...",
		/* DIA_LAST_03_HIRO */			"... and all I had to do, was to type letters... ehhh...",
	};
}