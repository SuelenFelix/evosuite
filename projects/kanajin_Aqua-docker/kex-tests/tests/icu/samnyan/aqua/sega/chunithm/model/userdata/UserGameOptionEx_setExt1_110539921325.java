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

public class UserGameOptionEx_setExt1_110539921325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321211;
     Object term321509;

    public UserGameOptionEx_setExt1_110539921325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term321217 = new Long(-8172564209423941839L);
        term321211 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term321213 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term321215 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term321231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321268 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321324 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321329 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321377 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321423 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term321211, term321211.getClass(), "id", 2119299410269026045L);
        setLongField(term321213, term321213.getClass(), "id", -5320140534299857617L);
        setLongField(term321215, term321215.getClass(), "id", 6766205978981204063L);
        setField(term321215, term321215.getClass(), "extId", term321217);
        setField(term321215, term321215.getClass(), "luid", "noUqCHRNIJ");
        setIntField(term321232, term321232.getClass(), "year", 2026);
        setShortField(term321232, term321232.getClass(), "month", (short) 9);
        setShortField(term321232, term321232.getClass(), "day", (short) 23);
        setField(term321231, term321231.getClass(), "date", term321232);
        setByteField(term321236, term321236.getClass(), "hour", (byte) 5);
        setByteField(term321236, term321236.getClass(), "minute", (byte) 27);
        setByteField(term321236, term321236.getClass(), "second", (byte) 19);
        setIntField(term321236, term321236.getClass(), "nano", 223057028);
        setField(term321231, term321231.getClass(), "time", term321236);
        setField(term321215, term321215.getClass(), "registerTime", term321231);
        setIntField(term321242, term321242.getClass(), "year", 2019);
        setShortField(term321242, term321242.getClass(), "month", (short) 4);
        setShortField(term321242, term321242.getClass(), "day", (short) 20);
        setField(term321241, term321241.getClass(), "date", term321242);
        setByteField(term321246, term321246.getClass(), "hour", (byte) 18);
        setByteField(term321246, term321246.getClass(), "minute", (byte) 52);
        setByteField(term321246, term321246.getClass(), "second", (byte) 7);
        setIntField(term321246, term321246.getClass(), "nano", 845897679);
        setField(term321241, term321241.getClass(), "time", term321246);
        setField(term321215, term321215.getClass(), "accessTime", term321241);
        setField(term321213, term321213.getClass(), "card", term321215);
        setField(term321213, term321213.getClass(), "userName", "gUxWMTfcxo");
        setIntField(term321264, term321264.getClass(), "year", 2014);
        setShortField(term321264, term321264.getClass(), "month", (short) 1);
        setShortField(term321264, term321264.getClass(), "day", (short) 12);
        setField(term321263, term321263.getClass(), "date", term321264);
        setByteField(term321268, term321268.getClass(), "hour", (byte) 16);
        setByteField(term321268, term321268.getClass(), "minute", (byte) 14);
        setByteField(term321268, term321268.getClass(), "second", (byte) 46);
        setIntField(term321268, term321268.getClass(), "nano", 958339936);
        setField(term321263, term321263.getClass(), "time", term321268);
        setField(term321213, term321213.getClass(), "lastLoginDate", term321263);
        setBooleanField(term321213, term321213.getClass(), "isWebJoin", false);
        setField(term321213, term321213.getClass(), "webLimitDate", "JJbWybZFwv");
        setIntField(term321213, term321213.getClass(), "level", -2066077490);
        setIntField(term321213, term321213.getClass(), "reincarnationNum", 1724222715);
        setField(term321213, term321213.getClass(), "exp", "OFVygCZPpR");
        setLongField(term321213, term321213.getClass(), "point", 3106810755038337776L);
        setLongField(term321213, term321213.getClass(), "totalPoint", -673134296655462408L);
        setIntField(term321213, term321213.getClass(), "playCount", 296158792);
        setIntField(term321213, term321213.getClass(), "multiPlayCount", 132497002);
        setIntField(term321213, term321213.getClass(), "multiWinCount", 89033786);
        setIntField(term321213, term321213.getClass(), "requestResCount", -1720491783);
        setIntField(term321213, term321213.getClass(), "acceptResCount", -740145325);
        setIntField(term321213, term321213.getClass(), "successResCount", 403564511);
        setIntField(term321213, term321213.getClass(), "playerRating", -518011071);
        setIntField(term321213, term321213.getClass(), "highestRating", -11473506);
        setIntField(term321213, term321213.getClass(), "nameplateId", 984165021);
        setIntField(term321213, term321213.getClass(), "frameId", 1330156234);
        setIntField(term321213, term321213.getClass(), "characterId", 621404274);
        setIntField(term321213, term321213.getClass(), "trophyId", -502520589);
        setIntField(term321213, term321213.getClass(), "playedTutorialBit", -973774966);
        setIntField(term321213, term321213.getClass(), "firstTutorialCancelNum", 834522817);
        setIntField(term321213, term321213.getClass(), "masterTutorialCancelNum", -347786272);
        setIntField(term321213, term321213.getClass(), "totalRepertoireCount", 1060556162);
        setIntField(term321213, term321213.getClass(), "totalMapNum", 959380706);
        setLongField(term321213, term321213.getClass(), "totalHiScore", -3432351261442473005L);
        setLongField(term321213, term321213.getClass(), "totalBasicHighScore", 411936084149811843L);
        setLongField(term321213, term321213.getClass(), "totalAdvancedHighScore", -8587058752277798193L);
        setLongField(term321213, term321213.getClass(), "totalExpertHighScore", 7238374563402543937L);
        setLongField(term321213, term321213.getClass(), "totalMasterHighScore", 389739423857694314L);
        setIntField(term321325, term321325.getClass(), "year", 2018);
        setShortField(term321325, term321325.getClass(), "month", (short) 4);
        setShortField(term321325, term321325.getClass(), "day", (short) 3);
        setField(term321324, term321324.getClass(), "date", term321325);
        setByteField(term321329, term321329.getClass(), "hour", (byte) 4);
        setByteField(term321329, term321329.getClass(), "minute", (byte) 7);
        setByteField(term321329, term321329.getClass(), "second", (byte) 23);
        setIntField(term321329, term321329.getClass(), "nano", 669910327);
        setField(term321324, term321324.getClass(), "time", term321329);
        setField(term321213, term321213.getClass(), "eventWatchedDate", term321324);
        setIntField(term321213, term321213.getClass(), "friendCount", -326306383);
        setBooleanField(term321213, term321213.getClass(), "isMaimai", true);
        setField(term321213, term321213.getClass(), "firstGameId", "ERTUvcHbLH");
        setField(term321213, term321213.getClass(), "firstRomVersion", "jKiphxsuJM");
        setField(term321213, term321213.getClass(), "firstDataVersion", "uujNxYFnZF");
        setIntField(term321373, term321373.getClass(), "year", 2020);
        setShortField(term321373, term321373.getClass(), "month", (short) 8);
        setShortField(term321373, term321373.getClass(), "day", (short) 3);
        setField(term321372, term321372.getClass(), "date", term321373);
        setByteField(term321377, term321377.getClass(), "hour", (byte) 5);
        setByteField(term321377, term321377.getClass(), "minute", (byte) 7);
        setByteField(term321377, term321377.getClass(), "second", (byte) 37);
        setIntField(term321377, term321377.getClass(), "nano", 189952886);
        setField(term321372, term321372.getClass(), "time", term321377);
        setField(term321213, term321213.getClass(), "firstPlayDate", term321372);
        setField(term321213, term321213.getClass(), "lastGameId", "MXcfAuvVvj");
        setField(term321213, term321213.getClass(), "lastRomVersion", "IlgJTdCcvV");
        setField(term321213, term321213.getClass(), "lastDataVersion", "IEcNveAzGf");
        setIntField(term321419, term321419.getClass(), "year", 2029);
        setShortField(term321419, term321419.getClass(), "month", (short) 2);
        setShortField(term321419, term321419.getClass(), "day", (short) 4);
        setField(term321418, term321418.getClass(), "date", term321419);
        setByteField(term321423, term321423.getClass(), "hour", (byte) 13);
        setByteField(term321423, term321423.getClass(), "minute", (byte) 47);
        setByteField(term321423, term321423.getClass(), "second", (byte) 46);
        setIntField(term321423, term321423.getClass(), "nano", 194612067);
        setField(term321418, term321418.getClass(), "time", term321423);
        setField(term321213, term321213.getClass(), "lastPlayDate", term321418);
        setIntField(term321213, term321213.getClass(), "lastPlaceId", 540302191);
        setField(term321213, term321213.getClass(), "lastPlaceName", "rAOwMnTIRo");
        setField(term321213, term321213.getClass(), "lastRegionId", "wiCOTHLgkY");
        setField(term321213, term321213.getClass(), "lastRegionName", "xXIZkppQGj");
        setField(term321213, term321213.getClass(), "lastAllNetId", "htqYpwgttl");
        setField(term321213, term321213.getClass(), "lastClientId", "mtxJReaVzv");
        setField(term321211, term321211.getClass(), "user", term321213);
        setIntField(term321211, term321211.getClass(), "ext1", -609255604);
        setIntField(term321211, term321211.getClass(), "ext2", -82613070);
        setIntField(term321211, term321211.getClass(), "ext3", -784469011);
        setIntField(term321211, term321211.getClass(), "ext4", -1563306162);
        setIntField(term321211, term321211.getClass(), "ext5", 1768487935);
        setIntField(term321211, term321211.getClass(), "ext6", -1396395408);
        setIntField(term321211, term321211.getClass(), "ext7", 1098284426);
        setIntField(term321211, term321211.getClass(), "ext8", 1882274499);
        setIntField(term321211, term321211.getClass(), "ext9", 1481791080);
        setIntField(term321211, term321211.getClass(), "ext10", -1492881566);
        setIntField(term321211, term321211.getClass(), "ext11", -885209879);
        setIntField(term321211, term321211.getClass(), "ext12", 1147134253);
        setIntField(term321211, term321211.getClass(), "ext13", -1873437402);
        setIntField(term321211, term321211.getClass(), "ext14", 1861241151);
        setIntField(term321211, term321211.getClass(), "ext15", -124352876);
        setIntField(term321211, term321211.getClass(), "ext16", -1523749049);
        setIntField(term321211, term321211.getClass(), "ext17", 1334443168);
        setIntField(term321211, term321211.getClass(), "ext18", 1087084309);
        setIntField(term321211, term321211.getClass(), "ext19", -1293124018);
        setIntField(term321211, term321211.getClass(), "ext20", -719018839);
        term321509 = new Integer(-938374088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term321509;
        callMethod(klass, "setExt1", argTypes, term321211, args);
    }

};


