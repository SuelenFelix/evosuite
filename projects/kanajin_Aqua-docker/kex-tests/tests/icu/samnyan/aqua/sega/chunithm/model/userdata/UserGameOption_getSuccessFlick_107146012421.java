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

public class UserGameOption_getSuccessFlick_107146012421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58171;

    public UserGameOption_getSuccessFlick_107146012421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58177 = new Long(-5216789073301458893L);
        term58171 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term58173 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term58175 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58196 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58206 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58228 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58289 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58337 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58378 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58379 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58383 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term58171, term58171.getClass(), "id", -2071004435163577830L);
        setLongField(term58173, term58173.getClass(), "id", 4083439166031950748L);
        setLongField(term58175, term58175.getClass(), "id", 4354307959269121855L);
        setField(term58175, term58175.getClass(), "extId", term58177);
        setField(term58175, term58175.getClass(), "luid", "MbsTNUmNqV");
        setIntField(term58192, term58192.getClass(), "year", 2022);
        setShortField(term58192, term58192.getClass(), "month", (short) 10);
        setShortField(term58192, term58192.getClass(), "day", (short) 1);
        setField(term58191, term58191.getClass(), "date", term58192);
        setByteField(term58196, term58196.getClass(), "hour", (byte) 0);
        setByteField(term58196, term58196.getClass(), "minute", (byte) 56);
        setByteField(term58196, term58196.getClass(), "second", (byte) 38);
        setIntField(term58196, term58196.getClass(), "nano", 320635849);
        setField(term58191, term58191.getClass(), "time", term58196);
        setField(term58175, term58175.getClass(), "registerTime", term58191);
        setIntField(term58202, term58202.getClass(), "year", 2028);
        setShortField(term58202, term58202.getClass(), "month", (short) 4);
        setShortField(term58202, term58202.getClass(), "day", (short) 9);
        setField(term58201, term58201.getClass(), "date", term58202);
        setByteField(term58206, term58206.getClass(), "hour", (byte) 15);
        setByteField(term58206, term58206.getClass(), "minute", (byte) 32);
        setByteField(term58206, term58206.getClass(), "second", (byte) 25);
        setIntField(term58206, term58206.getClass(), "nano", 604005925);
        setField(term58201, term58201.getClass(), "time", term58206);
        setField(term58175, term58175.getClass(), "accessTime", term58201);
        setField(term58173, term58173.getClass(), "card", term58175);
        setField(term58173, term58173.getClass(), "userName", "VdDIonpedU");
        setIntField(term58224, term58224.getClass(), "year", 2011);
        setShortField(term58224, term58224.getClass(), "month", (short) 10);
        setShortField(term58224, term58224.getClass(), "day", (short) 26);
        setField(term58223, term58223.getClass(), "date", term58224);
        setByteField(term58228, term58228.getClass(), "hour", (byte) 19);
        setByteField(term58228, term58228.getClass(), "minute", (byte) 15);
        setByteField(term58228, term58228.getClass(), "second", (byte) 28);
        setIntField(term58228, term58228.getClass(), "nano", 465029232);
        setField(term58223, term58223.getClass(), "time", term58228);
        setField(term58173, term58173.getClass(), "lastLoginDate", term58223);
        setBooleanField(term58173, term58173.getClass(), "isWebJoin", true);
        setField(term58173, term58173.getClass(), "webLimitDate", "VjtXZcUFNx");
        setIntField(term58173, term58173.getClass(), "level", -263942209);
        setIntField(term58173, term58173.getClass(), "reincarnationNum", 820400430);
        setField(term58173, term58173.getClass(), "exp", "bOZSTccXbt");
        setLongField(term58173, term58173.getClass(), "point", -4627619845164555164L);
        setLongField(term58173, term58173.getClass(), "totalPoint", 3702843766990151556L);
        setIntField(term58173, term58173.getClass(), "playCount", -1841078275);
        setIntField(term58173, term58173.getClass(), "multiPlayCount", -875421053);
        setIntField(term58173, term58173.getClass(), "multiWinCount", 212464780);
        setIntField(term58173, term58173.getClass(), "requestResCount", -1698447008);
        setIntField(term58173, term58173.getClass(), "acceptResCount", 1429592368);
        setIntField(term58173, term58173.getClass(), "successResCount", -1997064536);
        setIntField(term58173, term58173.getClass(), "playerRating", 798438929);
        setIntField(term58173, term58173.getClass(), "highestRating", 795184090);
        setIntField(term58173, term58173.getClass(), "nameplateId", 1181730734);
        setIntField(term58173, term58173.getClass(), "frameId", -668958857);
        setIntField(term58173, term58173.getClass(), "characterId", -427688960);
        setIntField(term58173, term58173.getClass(), "trophyId", 343387902);
        setIntField(term58173, term58173.getClass(), "playedTutorialBit", 1492345954);
        setIntField(term58173, term58173.getClass(), "firstTutorialCancelNum", 1891017572);
        setIntField(term58173, term58173.getClass(), "masterTutorialCancelNum", -391361805);
        setIntField(term58173, term58173.getClass(), "totalRepertoireCount", 1171290917);
        setIntField(term58173, term58173.getClass(), "totalMapNum", 267258768);
        setLongField(term58173, term58173.getClass(), "totalHiScore", 8588047499427599529L);
        setLongField(term58173, term58173.getClass(), "totalBasicHighScore", 6126964308136745488L);
        setLongField(term58173, term58173.getClass(), "totalAdvancedHighScore", -8307140005890062599L);
        setLongField(term58173, term58173.getClass(), "totalExpertHighScore", 195324792518519601L);
        setLongField(term58173, term58173.getClass(), "totalMasterHighScore", 8741861751389973987L);
        setIntField(term58285, term58285.getClass(), "year", 2027);
        setShortField(term58285, term58285.getClass(), "month", (short) 2);
        setShortField(term58285, term58285.getClass(), "day", (short) 22);
        setField(term58284, term58284.getClass(), "date", term58285);
        setByteField(term58289, term58289.getClass(), "hour", (byte) 4);
        setByteField(term58289, term58289.getClass(), "minute", (byte) 59);
        setByteField(term58289, term58289.getClass(), "second", (byte) 50);
        setIntField(term58289, term58289.getClass(), "nano", 80562715);
        setField(term58284, term58284.getClass(), "time", term58289);
        setField(term58173, term58173.getClass(), "eventWatchedDate", term58284);
        setIntField(term58173, term58173.getClass(), "friendCount", 1779008869);
        setBooleanField(term58173, term58173.getClass(), "isMaimai", false);
        setField(term58173, term58173.getClass(), "firstGameId", "MBSsxxeNUU");
        setField(term58173, term58173.getClass(), "firstRomVersion", "NmUhmPLSgG");
        setField(term58173, term58173.getClass(), "firstDataVersion", "WJosrfBMfA");
        setIntField(term58333, term58333.getClass(), "year", 2018);
        setShortField(term58333, term58333.getClass(), "month", (short) 12);
        setShortField(term58333, term58333.getClass(), "day", (short) 31);
        setField(term58332, term58332.getClass(), "date", term58333);
        setByteField(term58337, term58337.getClass(), "hour", (byte) 21);
        setByteField(term58337, term58337.getClass(), "minute", (byte) 20);
        setByteField(term58337, term58337.getClass(), "second", (byte) 32);
        setIntField(term58337, term58337.getClass(), "nano", 236426663);
        setField(term58332, term58332.getClass(), "time", term58337);
        setField(term58173, term58173.getClass(), "firstPlayDate", term58332);
        setField(term58173, term58173.getClass(), "lastGameId", "ttlGywalKc");
        setField(term58173, term58173.getClass(), "lastRomVersion", "rQFBspqBzf");
        setField(term58173, term58173.getClass(), "lastDataVersion", "FmWhAOGAMI");
        setIntField(term58379, term58379.getClass(), "year", 2027);
        setShortField(term58379, term58379.getClass(), "month", (short) 10);
        setShortField(term58379, term58379.getClass(), "day", (short) 22);
        setField(term58378, term58378.getClass(), "date", term58379);
        setByteField(term58383, term58383.getClass(), "hour", (byte) 22);
        setByteField(term58383, term58383.getClass(), "minute", (byte) 49);
        setByteField(term58383, term58383.getClass(), "second", (byte) 17);
        setIntField(term58383, term58383.getClass(), "nano", 698349746);
        setField(term58378, term58378.getClass(), "time", term58383);
        setField(term58173, term58173.getClass(), "lastPlayDate", term58378);
        setIntField(term58173, term58173.getClass(), "lastPlaceId", -1058856035);
        setField(term58173, term58173.getClass(), "lastPlaceName", "GdjCkRsIrS");
        setField(term58173, term58173.getClass(), "lastRegionId", "MJNyYzLhkh");
        setField(term58173, term58173.getClass(), "lastRegionName", "DEugGJIaYt");
        setField(term58173, term58173.getClass(), "lastAllNetId", "lzZIObOJmC");
        setField(term58173, term58173.getClass(), "lastClientId", "RFmGKwvSgz");
        setField(term58171, term58171.getClass(), "user", term58173);
        setIntField(term58171, term58171.getClass(), "bgInfo", -91024448);
        setIntField(term58171, term58171.getClass(), "fieldColor", -744517334);
        setIntField(term58171, term58171.getClass(), "guideSound", -855464783);
        setIntField(term58171, term58171.getClass(), "soundEffect", 1496015170);
        setIntField(term58171, term58171.getClass(), "guideLine", 412507839);
        setIntField(term58171, term58171.getClass(), "speed", -143522206);
        setIntField(term58171, term58171.getClass(), "optionSet", 70726858);
        setIntField(term58171, term58171.getClass(), "matching", -1883665560);
        setIntField(term58171, term58171.getClass(), "judgePos", -1304361419);
        setIntField(term58171, term58171.getClass(), "rating", -1253063552);
        setIntField(term58171, term58171.getClass(), "judgeJustice", 11874750);
        setIntField(term58171, term58171.getClass(), "judgeAttack", -920088882);
        setIntField(term58171, term58171.getClass(), "headphone", -1963888580);
        setIntField(term58171, term58171.getClass(), "playerLevel", 885969140);
        setIntField(term58171, term58171.getClass(), "successTap", -573115224);
        setIntField(term58171, term58171.getClass(), "successExTap", 716083613);
        setIntField(term58171, term58171.getClass(), "successSlideHold", 236114197);
        setIntField(term58171, term58171.getClass(), "successAir", -1633292626);
        setIntField(term58171, term58171.getClass(), "successFlick", 689769597);
        setIntField(term58171, term58171.getClass(), "successSkill", -1219602723);
        setIntField(term58171, term58171.getClass(), "successTapTimbre", 1668201364);
        setIntField(term58171, term58171.getClass(), "privacy", -548343635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessFlick", argTypes, term58171, args);
    }

};


