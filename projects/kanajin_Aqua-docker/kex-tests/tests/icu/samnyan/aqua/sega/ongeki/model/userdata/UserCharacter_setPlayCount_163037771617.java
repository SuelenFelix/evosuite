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
import java.lang.Integer;

public class UserCharacter_setPlayCount_163037771617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175875;
     Object term176160;

    public UserCharacter_setPlayCount_163037771617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term175881 = new Long(-2083524977884307536L);
        term175875 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term175877 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term175879 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term175895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term175896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term175900 = newInstance(Class.forName("java.time.LocalTime"));
        Object term175905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term175906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term175910 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term175875, term175875.getClass(), "id", -6128461892721278131L);
        setLongField(term175877, term175877.getClass(), "id", -1543242469007824295L);
        setLongField(term175879, term175879.getClass(), "id", 1277903088423737567L);
        setField(term175879, term175879.getClass(), "extId", term175881);
        setField(term175879, term175879.getClass(), "luid", "LEJkuksMgd");
        setIntField(term175896, term175896.getClass(), "year", 2023);
        setShortField(term175896, term175896.getClass(), "month", (short) 12);
        setShortField(term175896, term175896.getClass(), "day", (short) 26);
        setField(term175895, term175895.getClass(), "date", term175896);
        setByteField(term175900, term175900.getClass(), "hour", (byte) 17);
        setByteField(term175900, term175900.getClass(), "minute", (byte) 38);
        setByteField(term175900, term175900.getClass(), "second", (byte) 54);
        setIntField(term175900, term175900.getClass(), "nano", 703000129);
        setField(term175895, term175895.getClass(), "time", term175900);
        setField(term175879, term175879.getClass(), "registerTime", term175895);
        setIntField(term175906, term175906.getClass(), "year", 2013);
        setShortField(term175906, term175906.getClass(), "month", (short) 8);
        setShortField(term175906, term175906.getClass(), "day", (short) 24);
        setField(term175905, term175905.getClass(), "date", term175906);
        setByteField(term175910, term175910.getClass(), "hour", (byte) 15);
        setByteField(term175910, term175910.getClass(), "minute", (byte) 52);
        setByteField(term175910, term175910.getClass(), "second", (byte) 16);
        setIntField(term175910, term175910.getClass(), "nano", 996842360);
        setField(term175905, term175905.getClass(), "time", term175910);
        setField(term175879, term175879.getClass(), "accessTime", term175905);
        setField(term175877, term175877.getClass(), "card", term175879);
        setField(term175877, term175877.getClass(), "userName", "dFfluQzBHo");
        setIntField(term175877, term175877.getClass(), "level", -462650026);
        setIntField(term175877, term175877.getClass(), "reincarnationNum", -662384827);
        setLongField(term175877, term175877.getClass(), "exp", -794318216184174871L);
        setLongField(term175877, term175877.getClass(), "point", -9193003593128428116L);
        setLongField(term175877, term175877.getClass(), "totalPoint", 3580621595897088737L);
        setIntField(term175877, term175877.getClass(), "playCount", 423501341);
        setIntField(term175877, term175877.getClass(), "jewelCount", 281728339);
        setIntField(term175877, term175877.getClass(), "totalJewelCount", 849043386);
        setIntField(term175877, term175877.getClass(), "medalCount", 1153533622);
        setIntField(term175877, term175877.getClass(), "playerRating", -188954978);
        setIntField(term175877, term175877.getClass(), "highestRating", 740548136);
        setIntField(term175877, term175877.getClass(), "battlePoint", 2136221804);
        setIntField(term175877, term175877.getClass(), "bestBattlePoint", 1553966793);
        setIntField(term175877, term175877.getClass(), "overDamageBattlePoint", 972197737);
        setBooleanField(term175877, term175877.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term175877, term175877.getClass(), "nameplateId", -710042993);
        setIntField(term175877, term175877.getClass(), "trophyId", 861747659);
        setIntField(term175877, term175877.getClass(), "cardId", 1991398488);
        setIntField(term175877, term175877.getClass(), "characterId", -356531986);
        setIntField(term175877, term175877.getClass(), "characterVoiceNo", 606220124);
        setIntField(term175877, term175877.getClass(), "tabSetting", -1383984508);
        setIntField(term175877, term175877.getClass(), "tabSortSetting", -604080370);
        setIntField(term175877, term175877.getClass(), "cardCategorySetting", -958163406);
        setIntField(term175877, term175877.getClass(), "cardSortSetting", 1073272246);
        setIntField(term175877, term175877.getClass(), "rivalScoreCategorySetting", -393108425);
        setIntField(term175877, term175877.getClass(), "playedTutorialBit", -1491497666);
        setIntField(term175877, term175877.getClass(), "firstTutorialCancelNum", 501016087);
        setLongField(term175877, term175877.getClass(), "sumTechHighScore", -5485319817298284150L);
        setLongField(term175877, term175877.getClass(), "sumTechBasicHighScore", 5062506679811364885L);
        setLongField(term175877, term175877.getClass(), "sumTechAdvancedHighScore", 72202288797284860L);
        setLongField(term175877, term175877.getClass(), "sumTechExpertHighScore", -4407620542485515440L);
        setLongField(term175877, term175877.getClass(), "sumTechMasterHighScore", 2919288170476234454L);
        setLongField(term175877, term175877.getClass(), "sumTechLunaticHighScore", -8968540338845961317L);
        setLongField(term175877, term175877.getClass(), "sumBattleHighScore", 5563787097561840935L);
        setLongField(term175877, term175877.getClass(), "sumBattleBasicHighScore", 998034108065079742L);
        setLongField(term175877, term175877.getClass(), "sumBattleAdvancedHighScore", -9090646855744689070L);
        setLongField(term175877, term175877.getClass(), "sumBattleExpertHighScore", -363939148082189305L);
        setLongField(term175877, term175877.getClass(), "sumBattleMasterHighScore", -1604620902518591106L);
        setLongField(term175877, term175877.getClass(), "sumBattleLunaticHighScore", 7040225765523952201L);
        setField(term175877, term175877.getClass(), "eventWatchedDate", "rGynvvclsd");
        setField(term175877, term175877.getClass(), "cmEventWatchedDate", "ymfafvBtWk");
        setField(term175877, term175877.getClass(), "firstGameId", "JPwJuSAFMV");
        setField(term175877, term175877.getClass(), "firstRomVersion", "rgJInRfHvu");
        setField(term175877, term175877.getClass(), "firstDataVersion", "BXyMmaBwrc");
        setField(term175877, term175877.getClass(), "firstPlayDate", "vEnSsMXyFp");
        setField(term175877, term175877.getClass(), "lastGameId", "kZgDFRIXuo");
        setField(term175877, term175877.getClass(), "lastRomVersion", "BQpqygpzrr");
        setField(term175877, term175877.getClass(), "lastDataVersion", "ZIlXJENLoo");
        setField(term175877, term175877.getClass(), "compatibleCmVersion", "exMpvwLuJn");
        setField(term175877, term175877.getClass(), "lastPlayDate", "mwlQNSbpmu");
        setIntField(term175877, term175877.getClass(), "lastPlaceId", -1697577715);
        setField(term175877, term175877.getClass(), "lastPlaceName", "EpUvGZYxqd");
        setIntField(term175877, term175877.getClass(), "lastRegionId", -1600100261);
        setField(term175877, term175877.getClass(), "lastRegionName", "qmpBfrEkWf");
        setIntField(term175877, term175877.getClass(), "lastAllNetId", -96376593);
        setField(term175877, term175877.getClass(), "lastClientId", "bUeNsGDmSt");
        setIntField(term175877, term175877.getClass(), "lastUsedDeckId", -782918431);
        setIntField(term175877, term175877.getClass(), "lastPlayMusicLevel", 68274251);
        setIntField(term175877, term175877.getClass(), "lastEmoneyBrand", -446931106);
        setField(term175875, term175875.getClass(), "user", term175877);
        setIntField(term175875, term175875.getClass(), "characterId", 831138363);
        setIntField(term175875, term175875.getClass(), "costumeId", -1626486283);
        setIntField(term175875, term175875.getClass(), "attachmentId", -116608439);
        setIntField(term175875, term175875.getClass(), "playCount", -1820369393);
        setIntField(term175875, term175875.getClass(), "intimateLevel", 1514212056);
        setIntField(term175875, term175875.getClass(), "intimateCount", -1119664670);
        setIntField(term175875, term175875.getClass(), "intimateCountRewarded", -537451132);
        setField(term175875, term175875.getClass(), "intimateCountDate", "JhtGqHtiGD");
        setBooleanField(term175875, term175875.getClass(), "isNew", true);
        term176160 = new Integer(-1722921664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176160;
        callMethod(klass, "setPlayCount", argTypes, term175875, args);
    }

};


