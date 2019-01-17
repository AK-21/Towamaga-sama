package demo;

abstract class TextContainer
{
	static final String TITLE = "トワマガ様";
	static final String DESCRIPTION="AmeEnjin 0.2 DEMO";
	
	static final String EMPTY_STRING = "TEXT";
	
	//---- System --------
	static final int LABEL_EXIT = 0;
	static final int LABEL_SAVE = 1;
	static final int LABEL_OVERWRITE = 2;
	static final int LABEL_MENU = 3;
	static final int LABEL_SAVE_SUCCESS = 4;
	static final int WARN_EMPTY = 5;
	static final int WARN_TOO_LONG = 6;		
	static final int BTN_YES = 7;
	static final int BTN_NO = 8;	
	static final int BTN_SAVE = 9;
	static final int BTN_CANCEL = 10;	
	static final int BTN_OK = 11;	
	static final int BTN_EXIT = 12;
	static final int BTN_CONTINUE = 13;
	
	static final int ARR_SIZE_SYS = 14;
	
	//---- Abilities -----
	static final int ATK_DEFAULT_NAME = 0;
	static final int ATK_SHURIKEN_NAME = 1;
	static final int ATK_STRONG_NAME = 2;
	static final int ATK_CUTS_NAME = 3;
	static final int ATK_SHIZAN_NAME = 4;
	static final int ATK_KESAGAKE_NAME = 5;
	static final int ATK_WRATH_NAME = 6;
	static final int ATK_CLAWS_NAME = 7;
	static final int HEAL_DEFAULT_NAME = 8;
	static final int HEAL_GREAT_NAME = 9;
	static final int HEAL_RICE_NAME = 10;
	static final int HEAL_SAKE_NAME = 11;
	static final int HEAL_SUSHI_NAME = 12;
	
	static final int ARR_SIZE_ABILITIES = 13;
	
	//---- Credits -------
	static final int CR_AME_H = 0;
	static final int CR_AME_L1 = 1;
	static final int CR_AME_L2 = 2;
	static final int CR_AUTHOR_H = 3;
	static final int CR_AUTHOR_L1 = 4;
	static final int CR_LIB_H = 5;
	static final int CR_LIB_L1 = 6;
	static final int CR_LIB_L2 = 7;
	static final int CR_LIB_L3 = 8;
	static final int CR_FNT_H = 9;
	static final int CR_FNT_L1 = 10;
	static final int CR_FNT_L2 = 11;
	
	static final int ARR_SIZE_CREDITS = 12;
	
	//---- Screens -------
	static final int SCR_PRE_INTRO = 0;
	static final int SCR_POST_INTRO = 1;
	static final int SCR_TRY_AGAIN = 2;
	static final int SCR_END = 3;
	static final int SCR_PRESS_TO_EXIT = 4;
	static final int SCR_BATTLE_1 = 5;
	static final int SCR_BATTLE_2 = 6;
	
	static final int ARR_SIZE_SCR = 7;
	
	//---- Dialogues -------
	static final int DIA_BEGIN_01_TOWAMAGA = 0;
	static final int DIA_BEGIN_02_TOWAMAGA = 1;	
	static final int DIA_BEGIN_03_HIRO = 2;
	static final int DIA_BEGIN_04_TOWAMAGA = 3;
	static final int DIA_BEGIN_05_HIRO = 4;
	static final int DIA_BEGIN_06_HIRO = 5;
	static final int DIA_BEGIN_07_TOWAMAGA = 6;
	static final int DIA_BEGIN_08_TOWAMAGA = 7;	
	static final int DIA_BEGIN_09_HIRO = 8;
	static final int DIA_BEGIN_10_TOWAMAGA = 9;
	static final int DIA_BEGIN_11_TOWAMAGA = 10;
	static final int DIA_BEGIN_12_TOWAMAGA = 11;
	static final int DIA_BEGIN_13_HIRO = 12;
	static final int DIA_BEGIN_14_HIRO = 13;
	static final int DIA_BEGIN_15_TOWAMAGA = 14;
	static final int DIA_BEGIN_16_TOWAMAGA = 15;	
	static final int COUNT_DIA_BEGIN = 16;
	
	static final int DIA_LOSE_01_HIRO = 16;
	static final int COUNT_DIA_LOSE = 1;
	
	static final int DIA_VICTORY_01_HIRO = 17;
	static final int DIA_VICTORY_02_TOWAMAGA = 18;
	static final int DIA_VICTORY_03_HIRO = 19;
	static final int DIA_VICTORY_04_HIRO = 20;
	static final int COUNT_DIA_VICTORY = 4;
	
	static final int DIA_LAST_01_HIRO =21;
	static final int DIA_LAST_02_HIRO =22;
	static final int DIA_LAST_03_HIRO =23;
	static final int COUNT_DIA_LAST = 3;
	
	static final int ARR_SIZE_DIA = COUNT_DIA_BEGIN + COUNT_DIA_VICTORY + COUNT_DIA_LOSE + COUNT_DIA_LAST;
	
	TextContainer()
	{
		vSystem = new String[ARR_SIZE_SYS];
		vAbilities = new String[ARR_SIZE_ABILITIES];
		vIntro = new String[] {EMPTY_STRING};
		vScreens = new String[ARR_SIZE_SCR];
		vDias = new String[ARR_SIZE_DIA];
		vCredits = new String[ARR_SIZE_CREDITS];
	}
	
	private String get(int index, String[] array)
	{
		if(array!=null && index>=0 && index<array.length)
			return array[index];
		return EMPTY_STRING;
	}
	
	private void fillArray(String[] arrayToFill, String newContent[])
	{
		for(int i=0; i<arrayToFill.length; i++)
		{
			if(i<newContent.length && newContent[i]!=null)
				arrayToFill[i]=newContent[i];
			else
				arrayToFill[i]=EMPTY_STRING;
		}
	}
	
	//---- System --------
	private String[] vSystem;
	/*
	[SIZE] ARR_SIZE_SYS = 14	
	[0] LABEL_EXIT
	[1] LABEL_SAVE
	[2] LABEL_OVERWRITE
	[3] LABEL_MENU
	[4] LABEL_SAVE_SUCCESS
	[5] WARN_EMPTY
	[6] WARN_TOO_LONG
	[7] BTN_YES
	[8] BTN_NO
	[9] BTN_SAVE
	[10] BTN_CANCEL
	[11] BTN_OK
	[12] BTN_EXIT
	[13] BTN_CONTINUE
	*/
	
	protected void setSysTextArr(String[] array)
	{
		fillArray(vSystem, array);
	}
	
	String getSys(int index)
	{
		return get(index, vSystem);
	}
	
	//---- Abilities -----
	private String[] vAbilities;
	/*
	[SIZE] ARR_SIZE_ABILITIES = 13	
	[0] ATK_DEFAULT_NAME
	[1] ATK_SHURIKEN_NAME
	[2] ATK_STRONG_NAME
	[3] ATK_CUTS_NAME
	[4] ATK_SHIZAN_NAME
	[5] ATK_KESAGAKE_NAME
	[6] ATK_WRATH_NAME
	[7] ATK_CLAWS_NAME
	[8] HEAL_DEFAULT_NAME
	[9] HEAL_GREAT_NAME
	[10] HEAL_RICE_NAME
	[11] HEAL_SAKE_NAME
	[12] HEAL_SUSHI_NAME
	*/

	protected void setAbilitiesTextArr(String[] array)
	{
		fillArray(vAbilities, array);
	}
	
	String getAbility(int index)
	{
		return get(index, vAbilities);
	}
	
	//---- Credits -------
		private String[] vCredits;
		/*
		[SIZE] ARR_SIZE_CREDITS = 12	
		[0] CR_AME_H
		[1] CR_AME_L1
		[2] CR_AME_L2
		[3] CR_AUTHOR_H
		[4] CR_AUTHOR_L1
		[5] CR_LIB_H
		[6] CR_LIB_L1
		[7] CR_LIB_L2
		[8] CR_LIB_L3
		[9] CR_FNT_H
		[10] CR_FNT_L1
		[11] CR_FNT_L2
		*/

		protected void setCreditsTextArr(String[] array)
		{
			fillArray(vCredits, array);
		}
		
		String getCreditsText(int index)
		{
			return get(index, vCredits);
		}
	
	//---- Intro ---------
	private String[] vIntro;
	
	protected void setIntro(String[] intro)
	{
		if(intro!=null)
		{
			vIntro = new String[intro.length];
			for(int i=0; i<intro.length; i++)
				if(intro[i]!=null)
					vIntro[i]=intro[i];
				else
					vIntro[i]=EMPTY_STRING;
		}
	}
	
	String[] getIntro()
	{
		return vIntro;
	}
	
	//---- Screens -------
	private String[] vScreens;
	/*
	[SIZE] ARR_SIZE_SCR = 7	
	[0] SCR_PRE_INTRO
	[1] SCR_POST_INTRO
	[2] SCR_TRY_AGAIN
	[3] SCR_END
	[4] SCR_PRESS_TO_EXIT
	[5] SCR_BATTLE_1
	[6] SCR_BATTLE_2
	*/
	
	protected void setScrTextArr(String[] array)
	{
		fillArray(vScreens, array);
	}
	
	String getScr(int index)
	{
		return get(index, vScreens);
	}
	
	//---- Dialogues -------
	private String[] vDias;
	/*
	[SIZE] ARR_SIZE_DIA = 
	[0] DIA_BEGIN_01_TOWAMAGA
	[1] DIA_BEGIN_02_TOWAMAGA
	[2] DIA_BEGIN_03_HIRO
	[3] DIA_BEGIN_04_TOWAMAGA
	[4] DIA_BEGIN_05_HIRO
	[5] DIA_BEGIN_06_HIRO
	[6] DIA_BEGIN_07_TOWAMAGA
	[7] DIA_BEGIN_08_TOWAMAGA
	[8] DIA_BEGIN_09_HIRO
	[9] DIA_BEGIN_10_TOWAMAGA
	[10] DIA_BEGIN_11_TOWAMAGA
	[11] DIA_BEGIN_12_TOWAMAGA
	[12] DIA_BEGIN_13_HIRO
	[13] DIA_BEGIN_14_HIRO
	[14] DIA_BEGIN_15_TOWAMAGA
	[15] DIA_BEGIN_16_TOWAMAGA
	[16] DIA_LOSE_01_HIRO
	[17] DIA_VICTORY_01_HIRO
	[18] DIA_VICTORY_02_TOWAMAGA
	[19] DIA_VICTORY_03_HIRO
	[20] DIA_VICTORY_04_HIRO
	[21] DIA_LAST_01_HIRO
	[22] DIA_LAST_02_HIRO
	[23] DIA_LAST_03_HIRO
	*/
	
	
	protected void setDiaTextArr(String[] array)
	{
		fillArray(vDias, array);
	}
	
	String getDia(int index)
	{
		return get(index, vDias);
	}	
}
