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

public class UserData_getId_206595960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129381;

    public UserData_getId_206595960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term129385 = new Long(6248239231585852341L);
        term129381 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term129383 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term129399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129404 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129414 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129436 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129497 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129545 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129591 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term129381, term129381.getClass(), "id", -3843490164753656521L);
        setLongField(term129383, term129383.getClass(), "id", -284029314740948763L);
        setField(term129383, term129383.getClass(), "extId", term129385);
        setField(term129383, term129383.getClass(), "luid", "xFTRWovmcb");
        setIntField(term129400, term129400.getClass(), "year", 2018);
        setShortField(term129400, term129400.getClass(), "month", (short) 5);
        setShortField(term129400, term129400.getClass(), "day", (short) 21);
        setField(term129399, term129399.getClass(), "date", term129400);
        setByteField(term129404, term129404.getClass(), "hour", (byte) 5);
        setByteField(term129404, term129404.getClass(), "minute", (byte) 33);
        setByteField(term129404, term129404.getClass(), "second", (byte) 46);
        setIntField(term129404, term129404.getClass(), "nano", 925508421);
        setField(term129399, term129399.getClass(), "time", term129404);
        setField(term129383, term129383.getClass(), "registerTime", term129399);
        setIntField(term129410, term129410.getClass(), "year", 2019);
        setShortField(term129410, term129410.getClass(), "month", (short) 11);
        setShortField(term129410, term129410.getClass(), "day", (short) 26);
        setField(term129409, term129409.getClass(), "date", term129410);
        setByteField(term129414, term129414.getClass(), "hour", (byte) 0);
        setByteField(term129414, term129414.getClass(), "minute", (byte) 52);
        setByteField(term129414, term129414.getClass(), "second", (byte) 46);
        setIntField(term129414, term129414.getClass(), "nano", 395192883);
        setField(term129409, term129409.getClass(), "time", term129414);
        setField(term129383, term129383.getClass(), "accessTime", term129409);
        setField(term129381, term129381.getClass(), "card", term129383);
        setField(term129381, term129381.getClass(), "userName", "fDNpBZJcEK");
        setIntField(term129432, term129432.getClass(), "year", 2012);
        setShortField(term129432, term129432.getClass(), "month", (short) 7);
        setShortField(term129432, term129432.getClass(), "day", (short) 9);
        setField(term129431, term129431.getClass(), "date", term129432);
        setByteField(term129436, term129436.getClass(), "hour", (byte) 5);
        setByteField(term129436, term129436.getClass(), "minute", (byte) 16);
        setByteField(term129436, term129436.getClass(), "second", (byte) 26);
        setIntField(term129436, term129436.getClass(), "nano", 245766052);
        setField(term129431, term129431.getClass(), "time", term129436);
        setField(term129381, term129381.getClass(), "lastLoginDate", term129431);
        setBooleanField(term129381, term129381.getClass(), "isWebJoin", false);
        setField(term129381, term129381.getClass(), "webLimitDate", "jURNSwGUrp");
        setIntField(term129381, term129381.getClass(), "level", 1981104215);
        setIntField(term129381, term129381.getClass(), "reincarnationNum", 2123592941);
        setField(term129381, term129381.getClass(), "exp", "nIWnIRXTGB");
        setLongField(term129381, term129381.getClass(), "point", 4860332338697838407L);
        setLongField(term129381, term129381.getClass(), "totalPoint", 7957736606041323894L);
        setIntField(term129381, term129381.getClass(), "playCount", 1043204008);
        setIntField(term129381, term129381.getClass(), "multiPlayCount", -2069490710);
        setIntField(term129381, term129381.getClass(), "multiWinCount", -336592077);
        setIntField(term129381, term129381.getClass(), "requestResCount", -1038346147);
        setIntField(term129381, term129381.getClass(), "acceptResCount", -759212248);
        setIntField(term129381, term129381.getClass(), "successResCount", 710373985);
        setIntField(term129381, term129381.getClass(), "playerRating", -1098158176);
        setIntField(term129381, term129381.getClass(), "highestRating", -187070398);
        setIntField(term129381, term129381.getClass(), "nameplateId", -1230319081);
        setIntField(term129381, term129381.getClass(), "frameId", -108342419);
        setIntField(term129381, term129381.getClass(), "characterId", -2084652820);
        setIntField(term129381, term129381.getClass(), "trophyId", -1596509485);
        setIntField(term129381, term129381.getClass(), "playedTutorialBit", 1787629634);
        setIntField(term129381, term129381.getClass(), "firstTutorialCancelNum", 746589330);
        setIntField(term129381, term129381.getClass(), "masterTutorialCancelNum", -2087341902);
        setIntField(term129381, term129381.getClass(), "totalRepertoireCount", -1552395095);
        setIntField(term129381, term129381.getClass(), "totalMapNum", 1119787944);
        setLongField(term129381, term129381.getClass(), "totalHiScore", -774227429807654813L);
        setLongField(term129381, term129381.getClass(), "totalBasicHighScore", -5319860952452203184L);
        setLongField(term129381, term129381.getClass(), "totalAdvancedHighScore", -6281514459098412431L);
        setLongField(term129381, term129381.getClass(), "totalExpertHighScore", 5567722699288031168L);
        setLongField(term129381, term129381.getClass(), "totalMasterHighScore", 1180545199518658689L);
        setIntField(term129493, term129493.getClass(), "year", 2012);
        setShortField(term129493, term129493.getClass(), "month", (short) 8);
        setShortField(term129493, term129493.getClass(), "day", (short) 14);
        setField(term129492, term129492.getClass(), "date", term129493);
        setByteField(term129497, term129497.getClass(), "hour", (byte) 7);
        setByteField(term129497, term129497.getClass(), "minute", (byte) 45);
        setByteField(term129497, term129497.getClass(), "second", (byte) 8);
        setIntField(term129497, term129497.getClass(), "nano", 893541326);
        setField(term129492, term129492.getClass(), "time", term129497);
        setField(term129381, term129381.getClass(), "eventWatchedDate", term129492);
        setIntField(term129381, term129381.getClass(), "friendCount", 2099414259);
        setBooleanField(term129381, term129381.getClass(), "isMaimai", true);
        setField(term129381, term129381.getClass(), "firstGameId", "cjGGcykErb");
        setField(term129381, term129381.getClass(), "firstRomVersion", "ahJJxxxyVu");
        setField(term129381, term129381.getClass(), "firstDataVersion", "IABlyhoUtz");
        setIntField(term129541, term129541.getClass(), "year", 2017);
        setShortField(term129541, term129541.getClass(), "month", (short) 3);
        setShortField(term129541, term129541.getClass(), "day", (short) 23);
        setField(term129540, term129540.getClass(), "date", term129541);
        setByteField(term129545, term129545.getClass(), "hour", (byte) 14);
        setByteField(term129545, term129545.getClass(), "minute", (byte) 30);
        setByteField(term129545, term129545.getClass(), "second", (byte) 28);
        setIntField(term129545, term129545.getClass(), "nano", 739068464);
        setField(term129540, term129540.getClass(), "time", term129545);
        setField(term129381, term129381.getClass(), "firstPlayDate", term129540);
        setField(term129381, term129381.getClass(), "lastGameId", "QDgkRKDgSY");
        setField(term129381, term129381.getClass(), "lastRomVersion", "SptxbRhzuT");
        setField(term129381, term129381.getClass(), "lastDataVersion", "mIFDQhdALu");
        setIntField(term129587, term129587.getClass(), "year", 2023);
        setShortField(term129587, term129587.getClass(), "month", (short) 11);
        setShortField(term129587, term129587.getClass(), "day", (short) 19);
        setField(term129586, term129586.getClass(), "date", term129587);
        setByteField(term129591, term129591.getClass(), "hour", (byte) 5);
        setByteField(term129591, term129591.getClass(), "minute", (byte) 30);
        setByteField(term129591, term129591.getClass(), "second", (byte) 37);
        setIntField(term129591, term129591.getClass(), "nano", 59042636);
        setField(term129586, term129586.getClass(), "time", term129591);
        setField(term129381, term129381.getClass(), "lastPlayDate", term129586);
        setIntField(term129381, term129381.getClass(), "lastPlaceId", 1080055407);
        setField(term129381, term129381.getClass(), "lastPlaceName", "IfjNTGtdwY");
        setField(term129381, term129381.getClass(), "lastRegionId", "ToupqTNDBq");
        setField(term129381, term129381.getClass(), "lastRegionName", "yzFbLpPTrq");
        setField(term129381, term129381.getClass(), "lastAllNetId", "iYRIEjEhxB");
        setField(term129381, term129381.getClass(), "lastClientId", "EyLarnQiro");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term129381, args);
    }

};


