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

public class UserData_setLastRegionName_1349030422118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72248;

    public UserData_setLastRegionName_1349030422118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term72252 = new Long(-8892586408602479513L);
        term72248 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term72250 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term72266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72271 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72281 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term72248, term72248.getClass(), "id", 8565557338431532040L);
        setLongField(term72250, term72250.getClass(), "id", 6166105616036971710L);
        setField(term72250, term72250.getClass(), "extId", term72252);
        setField(term72250, term72250.getClass(), "luid", "BmnUezUoWz");
        setIntField(term72267, term72267.getClass(), "year", 2023);
        setShortField(term72267, term72267.getClass(), "month", (short) 12);
        setShortField(term72267, term72267.getClass(), "day", (short) 3);
        setField(term72266, term72266.getClass(), "date", term72267);
        setByteField(term72271, term72271.getClass(), "hour", (byte) 14);
        setByteField(term72271, term72271.getClass(), "minute", (byte) 6);
        setByteField(term72271, term72271.getClass(), "second", (byte) 20);
        setIntField(term72271, term72271.getClass(), "nano", 660325634);
        setField(term72266, term72266.getClass(), "time", term72271);
        setField(term72250, term72250.getClass(), "registerTime", term72266);
        setIntField(term72277, term72277.getClass(), "year", 2019);
        setShortField(term72277, term72277.getClass(), "month", (short) 2);
        setShortField(term72277, term72277.getClass(), "day", (short) 13);
        setField(term72276, term72276.getClass(), "date", term72277);
        setByteField(term72281, term72281.getClass(), "hour", (byte) 5);
        setByteField(term72281, term72281.getClass(), "minute", (byte) 59);
        setByteField(term72281, term72281.getClass(), "second", (byte) 42);
        setIntField(term72281, term72281.getClass(), "nano", 720385556);
        setField(term72276, term72276.getClass(), "time", term72281);
        setField(term72250, term72250.getClass(), "accessTime", term72276);
        setField(term72248, term72248.getClass(), "card", term72250);
        setField(term72248, term72248.getClass(), "userName", "QqeCgeRpIS");
        setIntField(term72248, term72248.getClass(), "level", -1516708019);
        setIntField(term72248, term72248.getClass(), "reincarnationNum", 1316108940);
        setLongField(term72248, term72248.getClass(), "exp", -5620922687611709677L);
        setLongField(term72248, term72248.getClass(), "point", -2346105813386002114L);
        setLongField(term72248, term72248.getClass(), "totalPoint", -8289034985880178543L);
        setIntField(term72248, term72248.getClass(), "playCount", -1092328406);
        setIntField(term72248, term72248.getClass(), "jewelCount", -1065662465);
        setIntField(term72248, term72248.getClass(), "totalJewelCount", 689033534);
        setIntField(term72248, term72248.getClass(), "medalCount", -1092529867);
        setIntField(term72248, term72248.getClass(), "playerRating", -1788533025);
        setIntField(term72248, term72248.getClass(), "highestRating", -1271339104);
        setIntField(term72248, term72248.getClass(), "battlePoint", -815986276);
        setIntField(term72248, term72248.getClass(), "bestBattlePoint", 1352632981);
        setIntField(term72248, term72248.getClass(), "overDamageBattlePoint", -2076492465);
        setBooleanField(term72248, term72248.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term72248, term72248.getClass(), "nameplateId", -926106316);
        setIntField(term72248, term72248.getClass(), "trophyId", 142204732);
        setIntField(term72248, term72248.getClass(), "cardId", 1428877162);
        setIntField(term72248, term72248.getClass(), "characterId", -1464784083);
        setIntField(term72248, term72248.getClass(), "characterVoiceNo", -1564128892);
        setIntField(term72248, term72248.getClass(), "tabSetting", -638268686);
        setIntField(term72248, term72248.getClass(), "tabSortSetting", 213892075);
        setIntField(term72248, term72248.getClass(), "cardCategorySetting", 1635792054);
        setIntField(term72248, term72248.getClass(), "cardSortSetting", -2087784193);
        setIntField(term72248, term72248.getClass(), "rivalScoreCategorySetting", -112933890);
        setIntField(term72248, term72248.getClass(), "playedTutorialBit", -1810303698);
        setIntField(term72248, term72248.getClass(), "firstTutorialCancelNum", 3658317);
        setLongField(term72248, term72248.getClass(), "sumTechHighScore", 2163887912849925332L);
        setLongField(term72248, term72248.getClass(), "sumTechBasicHighScore", -4225761439324849295L);
        setLongField(term72248, term72248.getClass(), "sumTechAdvancedHighScore", 221832985952382123L);
        setLongField(term72248, term72248.getClass(), "sumTechExpertHighScore", -3843490164753656521L);
        setLongField(term72248, term72248.getClass(), "sumTechMasterHighScore", -284029314740948763L);
        setLongField(term72248, term72248.getClass(), "sumTechLunaticHighScore", 4860332338697838407L);
        setLongField(term72248, term72248.getClass(), "sumBattleHighScore", 7957736606041323894L);
        setLongField(term72248, term72248.getClass(), "sumBattleBasicHighScore", -774227429807654813L);
        setLongField(term72248, term72248.getClass(), "sumBattleAdvancedHighScore", -5319860952452203184L);
        setLongField(term72248, term72248.getClass(), "sumBattleExpertHighScore", -6281514459098412431L);
        setLongField(term72248, term72248.getClass(), "sumBattleMasterHighScore", 5567722699288031168L);
        setLongField(term72248, term72248.getClass(), "sumBattleLunaticHighScore", 1180545199518658689L);
        setField(term72248, term72248.getClass(), "eventWatchedDate", "xVwossmLda");
        setField(term72248, term72248.getClass(), "cmEventWatchedDate", "EvSQeALexj");
        setField(term72248, term72248.getClass(), "firstGameId", "VuprBjhWdI");
        setField(term72248, term72248.getClass(), "firstRomVersion", "CFGOXMbAUn");
        setField(term72248, term72248.getClass(), "firstDataVersion", "OxlZVhvedR");
        setField(term72248, term72248.getClass(), "firstPlayDate", "eoDtSQyUsr");
        setField(term72248, term72248.getClass(), "lastGameId", "RMTgBohsAX");
        setField(term72248, term72248.getClass(), "lastRomVersion", "kdYeXJnJGG");
        setField(term72248, term72248.getClass(), "lastDataVersion", "XEdoshuvxD");
        setField(term72248, term72248.getClass(), "compatibleCmVersion", "ljtopXMcRl");
        setField(term72248, term72248.getClass(), "lastPlayDate", "HHtcAGkfuz");
        setIntField(term72248, term72248.getClass(), "lastPlaceId", -1463342660);
        setField(term72248, term72248.getClass(), "lastPlaceName", "QZCuYHcIBC");
        setIntField(term72248, term72248.getClass(), "lastRegionId", 20803526);
        setField(term72248, term72248.getClass(), "lastRegionName", "hpvoFaAyIu");
        setIntField(term72248, term72248.getClass(), "lastAllNetId", 1322938574);
        setField(term72248, term72248.getClass(), "lastClientId", "dyqukIBJxC");
        setIntField(term72248, term72248.getClass(), "lastUsedDeckId", -1636808378);
        setIntField(term72248, term72248.getClass(), "lastPlayMusicLevel", 1132856767);
        setIntField(term72248, term72248.getClass(), "lastEmoneyBrand", 1028135109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MVMiGQdgnX";
        callMethod(klass, "setLastRegionName", argTypes, term72248, args);
    }

};


