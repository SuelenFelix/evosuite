package icu.samnyan.aqua.sega.ongeki.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserScenario_getId_7315864071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96544;

    public UserScenario_getId_7315864071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term96550 = new Long(-8338004844694486146L);
        term96544 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term96546 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term96548 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96569 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96579 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96544, term96544.getClass(), "id", -6243455599728192585L);
        setLongField(term96546, term96546.getClass(), "id", 575531199587856686L);
        setLongField(term96548, term96548.getClass(), "id", 3807044363471281164L);
        setField(term96548, term96548.getClass(), "extId", term96550);
        setField(term96548, term96548.getClass(), "luid", "IDibKvfdDt");
        setIntField(term96565, term96565.getClass(), "year", 2018);
        setShortField(term96565, term96565.getClass(), "month", (short) 12);
        setShortField(term96565, term96565.getClass(), "day", (short) 9);
        setField(term96564, term96564.getClass(), "date", term96565);
        setByteField(term96569, term96569.getClass(), "hour", (byte) 11);
        setByteField(term96569, term96569.getClass(), "minute", (byte) 17);
        setByteField(term96569, term96569.getClass(), "second", (byte) 16);
        setIntField(term96569, term96569.getClass(), "nano", 832353222);
        setField(term96564, term96564.getClass(), "time", term96569);
        setField(term96548, term96548.getClass(), "registerTime", term96564);
        setIntField(term96575, term96575.getClass(), "year", 2022);
        setShortField(term96575, term96575.getClass(), "month", (short) 10);
        setShortField(term96575, term96575.getClass(), "day", (short) 18);
        setField(term96574, term96574.getClass(), "date", term96575);
        setByteField(term96579, term96579.getClass(), "hour", (byte) 21);
        setByteField(term96579, term96579.getClass(), "minute", (byte) 51);
        setByteField(term96579, term96579.getClass(), "second", (byte) 0);
        setIntField(term96579, term96579.getClass(), "nano", 906699884);
        setField(term96574, term96574.getClass(), "time", term96579);
        setField(term96548, term96548.getClass(), "accessTime", term96574);
        setField(term96546, term96546.getClass(), "card", term96548);
        setField(term96546, term96546.getClass(), "userName", "sKLtBTAssF");
        setIntField(term96546, term96546.getClass(), "level", 2021579205);
        setIntField(term96546, term96546.getClass(), "reincarnationNum", 1117186881);
        setLongField(term96546, term96546.getClass(), "exp", 1004540771182420963L);
        setLongField(term96546, term96546.getClass(), "point", 8812485782991578366L);
        setLongField(term96546, term96546.getClass(), "totalPoint", 2565913054502508437L);
        setIntField(term96546, term96546.getClass(), "playCount", -116229778);
        setIntField(term96546, term96546.getClass(), "jewelCount", 1102287982);
        setIntField(term96546, term96546.getClass(), "totalJewelCount", 82817178);
        setIntField(term96546, term96546.getClass(), "medalCount", 1619985605);
        setIntField(term96546, term96546.getClass(), "playerRating", -1020794327);
        setIntField(term96546, term96546.getClass(), "highestRating", 719987081);
        setIntField(term96546, term96546.getClass(), "battlePoint", -1306969788);
        setIntField(term96546, term96546.getClass(), "bestBattlePoint", -272419076);
        setIntField(term96546, term96546.getClass(), "overDamageBattlePoint", -1366102520);
        setBooleanField(term96546, term96546.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term96546, term96546.getClass(), "nameplateId", -991083478);
        setIntField(term96546, term96546.getClass(), "trophyId", -1423864560);
        setIntField(term96546, term96546.getClass(), "cardId", 1155538873);
        setIntField(term96546, term96546.getClass(), "characterId", 868120753);
        setIntField(term96546, term96546.getClass(), "characterVoiceNo", 691240568);
        setIntField(term96546, term96546.getClass(), "tabSetting", 1689565461);
        setIntField(term96546, term96546.getClass(), "tabSortSetting", 1105348026);
        setIntField(term96546, term96546.getClass(), "cardCategorySetting", -35374943);
        setIntField(term96546, term96546.getClass(), "cardSortSetting", -561318198);
        setIntField(term96546, term96546.getClass(), "rivalScoreCategorySetting", -1196585904);
        setIntField(term96546, term96546.getClass(), "playedTutorialBit", 123352569);
        setIntField(term96546, term96546.getClass(), "firstTutorialCancelNum", 2027326435);
        setLongField(term96546, term96546.getClass(), "sumTechHighScore", -454342664626660706L);
        setLongField(term96546, term96546.getClass(), "sumTechBasicHighScore", -5121930167263789646L);
        setLongField(term96546, term96546.getClass(), "sumTechAdvancedHighScore", -5176212278898409578L);
        setLongField(term96546, term96546.getClass(), "sumTechExpertHighScore", 1522191658838512490L);
        setLongField(term96546, term96546.getClass(), "sumTechMasterHighScore", 1573287649333712014L);
        setLongField(term96546, term96546.getClass(), "sumTechLunaticHighScore", -2264973412738223689L);
        setLongField(term96546, term96546.getClass(), "sumBattleHighScore", 798197790924820945L);
        setLongField(term96546, term96546.getClass(), "sumBattleBasicHighScore", 3817454964079565213L);
        setLongField(term96546, term96546.getClass(), "sumBattleAdvancedHighScore", 204276416780080943L);
        setLongField(term96546, term96546.getClass(), "sumBattleExpertHighScore", 2468873293569704115L);
        setLongField(term96546, term96546.getClass(), "sumBattleMasterHighScore", -4627117639198460380L);
        setLongField(term96546, term96546.getClass(), "sumBattleLunaticHighScore", -7129102761188204063L);
        setField(term96546, term96546.getClass(), "eventWatchedDate", "ROGqSdboUf");
        setField(term96546, term96546.getClass(), "cmEventWatchedDate", "NfGNgrTcyY");
        setField(term96546, term96546.getClass(), "firstGameId", "uPuFIjvpsv");
        setField(term96546, term96546.getClass(), "firstRomVersion", "zNKHFvTvNQ");
        setField(term96546, term96546.getClass(), "firstDataVersion", "cyqgSKerVH");
        setField(term96546, term96546.getClass(), "firstPlayDate", "KMFbAPDgQN");
        setField(term96546, term96546.getClass(), "lastGameId", "pOXTylvole");
        setField(term96546, term96546.getClass(), "lastRomVersion", "kfguTpQAqI");
        setField(term96546, term96546.getClass(), "lastDataVersion", "YcPukufpJs");
        setField(term96546, term96546.getClass(), "compatibleCmVersion", "vvGshYKSpj");
        setField(term96546, term96546.getClass(), "lastPlayDate", "haqqYHJKqP");
        setIntField(term96546, term96546.getClass(), "lastPlaceId", 1185859348);
        setField(term96546, term96546.getClass(), "lastPlaceName", "pehbaguHxu");
        setIntField(term96546, term96546.getClass(), "lastRegionId", -1963285488);
        setField(term96546, term96546.getClass(), "lastRegionName", "pcQcluzQgA");
        setIntField(term96546, term96546.getClass(), "lastAllNetId", 390373954);
        setField(term96546, term96546.getClass(), "lastClientId", "iWOGNdtCLH");
        setIntField(term96546, term96546.getClass(), "lastUsedDeckId", 1525579039);
        setIntField(term96546, term96546.getClass(), "lastPlayMusicLevel", -509784163);
        setIntField(term96546, term96546.getClass(), "lastEmoneyBrand", 1503484564);
        setField(term96544, term96544.getClass(), "user", term96546);
        setIntField(term96544, term96544.getClass(), "scenarioId", -433236731);
        setIntField(term96544, term96544.getClass(), "playCount", 2003700950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term96544, args);
    }

};


