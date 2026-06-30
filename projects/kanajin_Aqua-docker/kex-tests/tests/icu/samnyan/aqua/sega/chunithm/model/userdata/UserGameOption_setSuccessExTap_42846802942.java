package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOption_setSuccessExTap_42846802942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68079;
     Object term68379;

    public UserGameOption_setSuccessExTap_42846802942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68085 = new Long(-900457279156388404L);
        term68079 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term68081 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term68083 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term68099 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68104 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68114 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68136 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68192 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68193 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68197 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68245 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68291 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term68079, term68079.getClass(), "id", 7397884986768994824L);
        setLongField(term68081, term68081.getClass(), "id", -4644072102027655025L);
        setLongField(term68083, term68083.getClass(), "id", 2739809214146796829L);
        setField(term68083, term68083.getClass(), "extId", term68085);
        setField(term68083, term68083.getClass(), "luid", "TLUhUnoanK");
        setIntField(term68100, term68100.getClass(), "year", 2024);
        setShortField(term68100, term68100.getClass(), "month", (short) 12);
        setShortField(term68100, term68100.getClass(), "day", (short) 29);
        setField(term68099, term68099.getClass(), "date", term68100);
        setByteField(term68104, term68104.getClass(), "hour", (byte) 22);
        setByteField(term68104, term68104.getClass(), "minute", (byte) 7);
        setByteField(term68104, term68104.getClass(), "second", (byte) 1);
        setIntField(term68104, term68104.getClass(), "nano", 924286363);
        setField(term68099, term68099.getClass(), "time", term68104);
        setField(term68083, term68083.getClass(), "registerTime", term68099);
        setIntField(term68110, term68110.getClass(), "year", 2011);
        setShortField(term68110, term68110.getClass(), "month", (short) 12);
        setShortField(term68110, term68110.getClass(), "day", (short) 13);
        setField(term68109, term68109.getClass(), "date", term68110);
        setByteField(term68114, term68114.getClass(), "hour", (byte) 4);
        setByteField(term68114, term68114.getClass(), "minute", (byte) 19);
        setByteField(term68114, term68114.getClass(), "second", (byte) 3);
        setIntField(term68114, term68114.getClass(), "nano", 325415099);
        setField(term68109, term68109.getClass(), "time", term68114);
        setField(term68083, term68083.getClass(), "accessTime", term68109);
        setField(term68081, term68081.getClass(), "card", term68083);
        setField(term68081, term68081.getClass(), "userName", "JXyQTIyIrU");
        setIntField(term68132, term68132.getClass(), "year", 2012);
        setShortField(term68132, term68132.getClass(), "month", (short) 2);
        setShortField(term68132, term68132.getClass(), "day", (short) 16);
        setField(term68131, term68131.getClass(), "date", term68132);
        setByteField(term68136, term68136.getClass(), "hour", (byte) 5);
        setByteField(term68136, term68136.getClass(), "minute", (byte) 12);
        setByteField(term68136, term68136.getClass(), "second", (byte) 33);
        setIntField(term68136, term68136.getClass(), "nano", 551526646);
        setField(term68131, term68131.getClass(), "time", term68136);
        setField(term68081, term68081.getClass(), "lastLoginDate", term68131);
        setBooleanField(term68081, term68081.getClass(), "isWebJoin", true);
        setField(term68081, term68081.getClass(), "webLimitDate", "uplmRQRGWr");
        setIntField(term68081, term68081.getClass(), "level", -1804104652);
        setIntField(term68081, term68081.getClass(), "reincarnationNum", -618717355);
        setField(term68081, term68081.getClass(), "exp", "ZEmNnaQFYB");
        setLongField(term68081, term68081.getClass(), "point", -7518786238963096989L);
        setLongField(term68081, term68081.getClass(), "totalPoint", 4080207137910567677L);
        setIntField(term68081, term68081.getClass(), "playCount", 942277782);
        setIntField(term68081, term68081.getClass(), "multiPlayCount", 1822833628);
        setIntField(term68081, term68081.getClass(), "multiWinCount", -125384487);
        setIntField(term68081, term68081.getClass(), "requestResCount", 335305737);
        setIntField(term68081, term68081.getClass(), "acceptResCount", -925570940);
        setIntField(term68081, term68081.getClass(), "successResCount", -995970411);
        setIntField(term68081, term68081.getClass(), "playerRating", -1408698769);
        setIntField(term68081, term68081.getClass(), "highestRating", -833650140);
        setIntField(term68081, term68081.getClass(), "nameplateId", 383587236);
        setIntField(term68081, term68081.getClass(), "frameId", 1305946167);
        setIntField(term68081, term68081.getClass(), "characterId", 1819681111);
        setIntField(term68081, term68081.getClass(), "trophyId", 1985692620);
        setIntField(term68081, term68081.getClass(), "playedTutorialBit", 534050336);
        setIntField(term68081, term68081.getClass(), "firstTutorialCancelNum", -1372609370);
        setIntField(term68081, term68081.getClass(), "masterTutorialCancelNum", 1366651612);
        setIntField(term68081, term68081.getClass(), "totalRepertoireCount", -2147136630);
        setIntField(term68081, term68081.getClass(), "totalMapNum", -639963675);
        setLongField(term68081, term68081.getClass(), "totalHiScore", -4510075168255947133L);
        setLongField(term68081, term68081.getClass(), "totalBasicHighScore", -8013089718329780345L);
        setLongField(term68081, term68081.getClass(), "totalAdvancedHighScore", -3786581600529665600L);
        setLongField(term68081, term68081.getClass(), "totalExpertHighScore", -8600923187723020360L);
        setLongField(term68081, term68081.getClass(), "totalMasterHighScore", 5010786103545221543L);
        setIntField(term68193, term68193.getClass(), "year", 2028);
        setShortField(term68193, term68193.getClass(), "month", (short) 5);
        setShortField(term68193, term68193.getClass(), "day", (short) 29);
        setField(term68192, term68192.getClass(), "date", term68193);
        setByteField(term68197, term68197.getClass(), "hour", (byte) 0);
        setByteField(term68197, term68197.getClass(), "minute", (byte) 20);
        setByteField(term68197, term68197.getClass(), "second", (byte) 4);
        setIntField(term68197, term68197.getClass(), "nano", 186776026);
        setField(term68192, term68192.getClass(), "time", term68197);
        setField(term68081, term68081.getClass(), "eventWatchedDate", term68192);
        setIntField(term68081, term68081.getClass(), "friendCount", -111415044);
        setBooleanField(term68081, term68081.getClass(), "isMaimai", false);
        setField(term68081, term68081.getClass(), "firstGameId", "FNxFpCZxLW");
        setField(term68081, term68081.getClass(), "firstRomVersion", "sXMXSCUbRu");
        setField(term68081, term68081.getClass(), "firstDataVersion", "iualVLfDmL");
        setIntField(term68241, term68241.getClass(), "year", 2021);
        setShortField(term68241, term68241.getClass(), "month", (short) 3);
        setShortField(term68241, term68241.getClass(), "day", (short) 30);
        setField(term68240, term68240.getClass(), "date", term68241);
        setByteField(term68245, term68245.getClass(), "hour", (byte) 4);
        setByteField(term68245, term68245.getClass(), "minute", (byte) 19);
        setByteField(term68245, term68245.getClass(), "second", (byte) 24);
        setIntField(term68245, term68245.getClass(), "nano", 421494175);
        setField(term68240, term68240.getClass(), "time", term68245);
        setField(term68081, term68081.getClass(), "firstPlayDate", term68240);
        setField(term68081, term68081.getClass(), "lastGameId", "bhEFtkUvDw");
        setField(term68081, term68081.getClass(), "lastRomVersion", "ZmbknwMIBa");
        setField(term68081, term68081.getClass(), "lastDataVersion", "UiRmBTpDTp");
        setIntField(term68287, term68287.getClass(), "year", 2028);
        setShortField(term68287, term68287.getClass(), "month", (short) 1);
        setShortField(term68287, term68287.getClass(), "day", (short) 9);
        setField(term68286, term68286.getClass(), "date", term68287);
        setByteField(term68291, term68291.getClass(), "hour", (byte) 10);
        setByteField(term68291, term68291.getClass(), "minute", (byte) 17);
        setByteField(term68291, term68291.getClass(), "second", (byte) 24);
        setIntField(term68291, term68291.getClass(), "nano", 95983008);
        setField(term68286, term68286.getClass(), "time", term68291);
        setField(term68081, term68081.getClass(), "lastPlayDate", term68286);
        setIntField(term68081, term68081.getClass(), "lastPlaceId", -1724633225);
        setField(term68081, term68081.getClass(), "lastPlaceName", "zQtuUgUIjK");
        setField(term68081, term68081.getClass(), "lastRegionId", "VBeGRjPsPN");
        setField(term68081, term68081.getClass(), "lastRegionName", "pZrAdSHQIs");
        setField(term68081, term68081.getClass(), "lastAllNetId", "XTOiucaEva");
        setField(term68081, term68081.getClass(), "lastClientId", "JMekRNxFMU");
        setField(term68079, term68079.getClass(), "user", term68081);
        setIntField(term68079, term68079.getClass(), "bgInfo", -285108418);
        setIntField(term68079, term68079.getClass(), "fieldColor", -1833551739);
        setIntField(term68079, term68079.getClass(), "guideSound", -408588900);
        setIntField(term68079, term68079.getClass(), "soundEffect", -768092851);
        setIntField(term68079, term68079.getClass(), "guideLine", -2040263086);
        setIntField(term68079, term68079.getClass(), "speed", -1917411490);
        setIntField(term68079, term68079.getClass(), "optionSet", -335301241);
        setIntField(term68079, term68079.getClass(), "matching", 911548156);
        setIntField(term68079, term68079.getClass(), "judgePos", -185022670);
        setIntField(term68079, term68079.getClass(), "rating", -761249284);
        setIntField(term68079, term68079.getClass(), "judgeJustice", 1921491694);
        setIntField(term68079, term68079.getClass(), "judgeAttack", -187830634);
        setIntField(term68079, term68079.getClass(), "headphone", 1691791355);
        setIntField(term68079, term68079.getClass(), "playerLevel", -1331748165);
        setIntField(term68079, term68079.getClass(), "successTap", 1369016583);
        setIntField(term68079, term68079.getClass(), "successExTap", 2033476845);
        setIntField(term68079, term68079.getClass(), "successSlideHold", 463965810);
        setIntField(term68079, term68079.getClass(), "successAir", 970217905);
        setIntField(term68079, term68079.getClass(), "successFlick", -486492381);
        setIntField(term68079, term68079.getClass(), "successSkill", 30517520);
        setIntField(term68079, term68079.getClass(), "successTapTimbre", 1096518455);
        setIntField(term68079, term68079.getClass(), "privacy", -1731653174);
        term68379 = new Integer(1249351936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term68379;
        callMethod(klass, "setSuccessExTap", argTypes, term68079, args);
    }

};


