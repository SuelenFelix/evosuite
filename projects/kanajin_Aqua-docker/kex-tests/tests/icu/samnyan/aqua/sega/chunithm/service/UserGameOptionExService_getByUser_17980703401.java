package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOptionExService_getByUser_17980703401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4269;

    public UserGameOptionExService_getByUser_17980703401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4273 = new Long(-872011222785455006L);
        term4269 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term4271 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4287 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4288 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4292 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4302 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4385 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4433 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4479 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4269, term4269.getClass(), "id", 855932984568615096L);
        setLongField(term4271, term4271.getClass(), "id", -1616722610139554082L);
        setField(term4271, term4271.getClass(), "extId", term4273);
        setField(term4271, term4271.getClass(), "luid", "tlQSNgTkQX");
        setIntField(term4288, term4288.getClass(), "year", 2013);
        setShortField(term4288, term4288.getClass(), "month", (short) 7);
        setShortField(term4288, term4288.getClass(), "day", (short) 26);
        setField(term4287, term4287.getClass(), "date", term4288);
        setByteField(term4292, term4292.getClass(), "hour", (byte) 14);
        setByteField(term4292, term4292.getClass(), "minute", (byte) 45);
        setByteField(term4292, term4292.getClass(), "second", (byte) 33);
        setIntField(term4292, term4292.getClass(), "nano", 547995853);
        setField(term4287, term4287.getClass(), "time", term4292);
        setField(term4271, term4271.getClass(), "registerTime", term4287);
        setIntField(term4298, term4298.getClass(), "year", 2016);
        setShortField(term4298, term4298.getClass(), "month", (short) 12);
        setShortField(term4298, term4298.getClass(), "day", (short) 20);
        setField(term4297, term4297.getClass(), "date", term4298);
        setByteField(term4302, term4302.getClass(), "hour", (byte) 8);
        setByteField(term4302, term4302.getClass(), "minute", (byte) 46);
        setByteField(term4302, term4302.getClass(), "second", (byte) 16);
        setIntField(term4302, term4302.getClass(), "nano", 10071864);
        setField(term4297, term4297.getClass(), "time", term4302);
        setField(term4271, term4271.getClass(), "accessTime", term4297);
        setField(term4269, term4269.getClass(), "card", term4271);
        setField(term4269, term4269.getClass(), "userName", "PCipZnmBOF");
        setIntField(term4320, term4320.getClass(), "year", 2021);
        setShortField(term4320, term4320.getClass(), "month", (short) 8);
        setShortField(term4320, term4320.getClass(), "day", (short) 27);
        setField(term4319, term4319.getClass(), "date", term4320);
        setByteField(term4324, term4324.getClass(), "hour", (byte) 20);
        setByteField(term4324, term4324.getClass(), "minute", (byte) 11);
        setByteField(term4324, term4324.getClass(), "second", (byte) 47);
        setIntField(term4324, term4324.getClass(), "nano", 116303493);
        setField(term4319, term4319.getClass(), "time", term4324);
        setField(term4269, term4269.getClass(), "lastLoginDate", term4319);
        setBooleanField(term4269, term4269.getClass(), "isWebJoin", true);
        setField(term4269, term4269.getClass(), "webLimitDate", "zcorEihhLK");
        setIntField(term4269, term4269.getClass(), "level", -288604325);
        setIntField(term4269, term4269.getClass(), "reincarnationNum", -1268314569);
        setField(term4269, term4269.getClass(), "exp", "GrqozDKFOk");
        setLongField(term4269, term4269.getClass(), "point", 7495904023107549024L);
        setLongField(term4269, term4269.getClass(), "totalPoint", 8802866251294305945L);
        setIntField(term4269, term4269.getClass(), "playCount", 877649659);
        setIntField(term4269, term4269.getClass(), "multiPlayCount", -1332748804);
        setIntField(term4269, term4269.getClass(), "multiWinCount", 1774507971);
        setIntField(term4269, term4269.getClass(), "requestResCount", -1420269858);
        setIntField(term4269, term4269.getClass(), "acceptResCount", -2119545015);
        setIntField(term4269, term4269.getClass(), "successResCount", 1272542218);
        setIntField(term4269, term4269.getClass(), "playerRating", 1209799204);
        setIntField(term4269, term4269.getClass(), "highestRating", 1094107751);
        setIntField(term4269, term4269.getClass(), "nameplateId", 844222656);
        setIntField(term4269, term4269.getClass(), "frameId", -18216811);
        setIntField(term4269, term4269.getClass(), "characterId", -1813280137);
        setIntField(term4269, term4269.getClass(), "trophyId", 719656595);
        setIntField(term4269, term4269.getClass(), "playedTutorialBit", -1516995753);
        setIntField(term4269, term4269.getClass(), "firstTutorialCancelNum", -390501023);
        setIntField(term4269, term4269.getClass(), "masterTutorialCancelNum", -1667482829);
        setIntField(term4269, term4269.getClass(), "totalRepertoireCount", 1116576792);
        setIntField(term4269, term4269.getClass(), "totalMapNum", -942194446);
        setLongField(term4269, term4269.getClass(), "totalHiScore", 4513004407927379358L);
        setLongField(term4269, term4269.getClass(), "totalBasicHighScore", -7115418542247301000L);
        setLongField(term4269, term4269.getClass(), "totalAdvancedHighScore", 8034714140377562739L);
        setLongField(term4269, term4269.getClass(), "totalExpertHighScore", -2924531382671518368L);
        setLongField(term4269, term4269.getClass(), "totalMasterHighScore", -3948863953565024517L);
        setIntField(term4381, term4381.getClass(), "year", 2012);
        setShortField(term4381, term4381.getClass(), "month", (short) 5);
        setShortField(term4381, term4381.getClass(), "day", (short) 17);
        setField(term4380, term4380.getClass(), "date", term4381);
        setByteField(term4385, term4385.getClass(), "hour", (byte) 19);
        setByteField(term4385, term4385.getClass(), "minute", (byte) 36);
        setByteField(term4385, term4385.getClass(), "second", (byte) 33);
        setIntField(term4385, term4385.getClass(), "nano", 46625011);
        setField(term4380, term4380.getClass(), "time", term4385);
        setField(term4269, term4269.getClass(), "eventWatchedDate", term4380);
        setIntField(term4269, term4269.getClass(), "friendCount", -938508470);
        setBooleanField(term4269, term4269.getClass(), "isMaimai", true);
        setField(term4269, term4269.getClass(), "firstGameId", "CFyoseFGLF");
        setField(term4269, term4269.getClass(), "firstRomVersion", "SFqCrhEWLm");
        setField(term4269, term4269.getClass(), "firstDataVersion", "GZdcJyZntS");
        setIntField(term4429, term4429.getClass(), "year", 2013);
        setShortField(term4429, term4429.getClass(), "month", (short) 7);
        setShortField(term4429, term4429.getClass(), "day", (short) 3);
        setField(term4428, term4428.getClass(), "date", term4429);
        setByteField(term4433, term4433.getClass(), "hour", (byte) 10);
        setByteField(term4433, term4433.getClass(), "minute", (byte) 59);
        setByteField(term4433, term4433.getClass(), "second", (byte) 22);
        setIntField(term4433, term4433.getClass(), "nano", 937921480);
        setField(term4428, term4428.getClass(), "time", term4433);
        setField(term4269, term4269.getClass(), "firstPlayDate", term4428);
        setField(term4269, term4269.getClass(), "lastGameId", "OIHoJeysUi");
        setField(term4269, term4269.getClass(), "lastRomVersion", "WXMWFDGcLB");
        setField(term4269, term4269.getClass(), "lastDataVersion", "wKWbJssZuG");
        setIntField(term4475, term4475.getClass(), "year", 2012);
        setShortField(term4475, term4475.getClass(), "month", (short) 2);
        setShortField(term4475, term4475.getClass(), "day", (short) 29);
        setField(term4474, term4474.getClass(), "date", term4475);
        setByteField(term4479, term4479.getClass(), "hour", (byte) 14);
        setByteField(term4479, term4479.getClass(), "minute", (byte) 26);
        setByteField(term4479, term4479.getClass(), "second", (byte) 20);
        setIntField(term4479, term4479.getClass(), "nano", 780823452);
        setField(term4474, term4474.getClass(), "time", term4479);
        setField(term4269, term4269.getClass(), "lastPlayDate", term4474);
        setIntField(term4269, term4269.getClass(), "lastPlaceId", 1242676024);
        setField(term4269, term4269.getClass(), "lastPlaceName", "NzBMMhkhpT");
        setField(term4269, term4269.getClass(), "lastRegionId", "qCpEbQDHdF");
        setField(term4269, term4269.getClass(), "lastRegionName", "AHbZyFOmlo");
        setField(term4269, term4269.getClass(), "lastAllNetId", "TwfWVQGiIj");
        setField(term4269, term4269.getClass(), "lastClientId", "gUvcueTURF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserGameOptionExService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term4269;
        callMethod(klass, "getByUser", argTypes, null, args);
    }

};


