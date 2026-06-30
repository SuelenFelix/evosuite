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

public class UserCard_init_7160316790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110859;

    public UserCard_init_7160316790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term110863 = new Long(3666226122807672448L);
        term110859 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term110861 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term110877 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110878 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110882 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110892 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term110859, term110859.getClass(), "id", -5843172964391342496L);
        setLongField(term110861, term110861.getClass(), "id", 3128444972440094090L);
        setField(term110861, term110861.getClass(), "extId", term110863);
        setField(term110861, term110861.getClass(), "luid", "VWIEojCQCj");
        setIntField(term110878, term110878.getClass(), "year", 2010);
        setShortField(term110878, term110878.getClass(), "month", (short) 11);
        setShortField(term110878, term110878.getClass(), "day", (short) 12);
        setField(term110877, term110877.getClass(), "date", term110878);
        setByteField(term110882, term110882.getClass(), "hour", (byte) 19);
        setByteField(term110882, term110882.getClass(), "minute", (byte) 8);
        setByteField(term110882, term110882.getClass(), "second", (byte) 0);
        setIntField(term110882, term110882.getClass(), "nano", 224480743);
        setField(term110877, term110877.getClass(), "time", term110882);
        setField(term110861, term110861.getClass(), "registerTime", term110877);
        setIntField(term110888, term110888.getClass(), "year", 2023);
        setShortField(term110888, term110888.getClass(), "month", (short) 6);
        setShortField(term110888, term110888.getClass(), "day", (short) 11);
        setField(term110887, term110887.getClass(), "date", term110888);
        setByteField(term110892, term110892.getClass(), "hour", (byte) 20);
        setByteField(term110892, term110892.getClass(), "minute", (byte) 37);
        setByteField(term110892, term110892.getClass(), "second", (byte) 26);
        setIntField(term110892, term110892.getClass(), "nano", 879792435);
        setField(term110887, term110887.getClass(), "time", term110892);
        setField(term110861, term110861.getClass(), "accessTime", term110887);
        setField(term110859, term110859.getClass(), "card", term110861);
        setField(term110859, term110859.getClass(), "userName", "jbeRMWjQTQ");
        setIntField(term110859, term110859.getClass(), "level", 1393801591);
        setIntField(term110859, term110859.getClass(), "reincarnationNum", -1187577742);
        setLongField(term110859, term110859.getClass(), "exp", 1874976089380311441L);
        setLongField(term110859, term110859.getClass(), "point", -6405468446402425599L);
        setLongField(term110859, term110859.getClass(), "totalPoint", 3371469305315842795L);
        setIntField(term110859, term110859.getClass(), "playCount", -793777683);
        setIntField(term110859, term110859.getClass(), "jewelCount", 1741594607);
        setIntField(term110859, term110859.getClass(), "totalJewelCount", 853592734);
        setIntField(term110859, term110859.getClass(), "medalCount", -626491911);
        setIntField(term110859, term110859.getClass(), "playerRating", -648815069);
        setIntField(term110859, term110859.getClass(), "highestRating", 1501415160);
        setIntField(term110859, term110859.getClass(), "battlePoint", 905044945);
        setIntField(term110859, term110859.getClass(), "bestBattlePoint", -1878642551);
        setIntField(term110859, term110859.getClass(), "overDamageBattlePoint", 300043927);
        setBooleanField(term110859, term110859.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term110859, term110859.getClass(), "nameplateId", 2122930718);
        setIntField(term110859, term110859.getClass(), "trophyId", -578301288);
        setIntField(term110859, term110859.getClass(), "cardId", -977176926);
        setIntField(term110859, term110859.getClass(), "characterId", 57300217);
        setIntField(term110859, term110859.getClass(), "characterVoiceNo", -296773597);
        setIntField(term110859, term110859.getClass(), "tabSetting", 1865713857);
        setIntField(term110859, term110859.getClass(), "tabSortSetting", 1621042327);
        setIntField(term110859, term110859.getClass(), "cardCategorySetting", -1687833420);
        setIntField(term110859, term110859.getClass(), "cardSortSetting", -1302564054);
        setIntField(term110859, term110859.getClass(), "rivalScoreCategorySetting", 1902301591);
        setIntField(term110859, term110859.getClass(), "playedTutorialBit", 1413243835);
        setIntField(term110859, term110859.getClass(), "firstTutorialCancelNum", 267793727);
        setLongField(term110859, term110859.getClass(), "sumTechHighScore", 2613121483651232843L);
        setLongField(term110859, term110859.getClass(), "sumTechBasicHighScore", 7369885657645743862L);
        setLongField(term110859, term110859.getClass(), "sumTechAdvancedHighScore", -1748584930648029253L);
        setLongField(term110859, term110859.getClass(), "sumTechExpertHighScore", 2016830289356150171L);
        setLongField(term110859, term110859.getClass(), "sumTechMasterHighScore", -8988533053281123772L);
        setLongField(term110859, term110859.getClass(), "sumTechLunaticHighScore", -6505574982283705297L);
        setLongField(term110859, term110859.getClass(), "sumBattleHighScore", 1520161374621643034L);
        setLongField(term110859, term110859.getClass(), "sumBattleBasicHighScore", 8305046077906092976L);
        setLongField(term110859, term110859.getClass(), "sumBattleAdvancedHighScore", 4247519809594043800L);
        setLongField(term110859, term110859.getClass(), "sumBattleExpertHighScore", -5285452288299088051L);
        setLongField(term110859, term110859.getClass(), "sumBattleMasterHighScore", -1468157235147075228L);
        setLongField(term110859, term110859.getClass(), "sumBattleLunaticHighScore", 5128145223609108267L);
        setField(term110859, term110859.getClass(), "eventWatchedDate", "YOjmohMpFb");
        setField(term110859, term110859.getClass(), "cmEventWatchedDate", "WCRWOgfbRC");
        setField(term110859, term110859.getClass(), "firstGameId", "MeiYkUfwEV");
        setField(term110859, term110859.getClass(), "firstRomVersion", "YOelMtNboh");
        setField(term110859, term110859.getClass(), "firstDataVersion", "ngShbLrxUt");
        setField(term110859, term110859.getClass(), "firstPlayDate", "tyyoVDzJBp");
        setField(term110859, term110859.getClass(), "lastGameId", "tbFDmscmBa");
        setField(term110859, term110859.getClass(), "lastRomVersion", "iwNiuIUhrn");
        setField(term110859, term110859.getClass(), "lastDataVersion", "uRfXEtHgIt");
        setField(term110859, term110859.getClass(), "compatibleCmVersion", "lzrbwfKykX");
        setField(term110859, term110859.getClass(), "lastPlayDate", "eZWnfePnkp");
        setIntField(term110859, term110859.getClass(), "lastPlaceId", 824213114);
        setField(term110859, term110859.getClass(), "lastPlaceName", "BSdXqptUKz");
        setIntField(term110859, term110859.getClass(), "lastRegionId", -1652054445);
        setField(term110859, term110859.getClass(), "lastRegionName", "UtzMtwAaid");
        setIntField(term110859, term110859.getClass(), "lastAllNetId", -2032148548);
        setField(term110859, term110859.getClass(), "lastClientId", "bchxgKxuUf");
        setIntField(term110859, term110859.getClass(), "lastUsedDeckId", 1592642995);
        setIntField(term110859, term110859.getClass(), "lastPlayMusicLevel", 537031810);
        setIntField(term110859, term110859.getClass(), "lastEmoneyBrand", -1280322093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term110859;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


