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

public class UserCharacter_getParam1_52657794210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112404;

    public UserCharacter_getParam1_52657794210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term112410 = new Long(3230472384687362867L);
        term112404 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term112406 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term112408 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term112424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112429 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112439 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112456 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112457 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112461 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112565 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112566 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112570 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112616 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term112404, term112404.getClass(), "id", 3084789868117337760L);
        setLongField(term112406, term112406.getClass(), "id", -3515538619235139741L);
        setLongField(term112408, term112408.getClass(), "id", -3470805235558058328L);
        setField(term112408, term112408.getClass(), "extId", term112410);
        setField(term112408, term112408.getClass(), "luid", "vCJwFnMbeg");
        setIntField(term112425, term112425.getClass(), "year", 2028);
        setShortField(term112425, term112425.getClass(), "month", (short) 2);
        setShortField(term112425, term112425.getClass(), "day", (short) 6);
        setField(term112424, term112424.getClass(), "date", term112425);
        setByteField(term112429, term112429.getClass(), "hour", (byte) 23);
        setByteField(term112429, term112429.getClass(), "minute", (byte) 10);
        setByteField(term112429, term112429.getClass(), "second", (byte) 20);
        setIntField(term112429, term112429.getClass(), "nano", 524964235);
        setField(term112424, term112424.getClass(), "time", term112429);
        setField(term112408, term112408.getClass(), "registerTime", term112424);
        setIntField(term112435, term112435.getClass(), "year", 2028);
        setShortField(term112435, term112435.getClass(), "month", (short) 6);
        setShortField(term112435, term112435.getClass(), "day", (short) 10);
        setField(term112434, term112434.getClass(), "date", term112435);
        setByteField(term112439, term112439.getClass(), "hour", (byte) 15);
        setByteField(term112439, term112439.getClass(), "minute", (byte) 10);
        setByteField(term112439, term112439.getClass(), "second", (byte) 25);
        setIntField(term112439, term112439.getClass(), "nano", 956921052);
        setField(term112434, term112434.getClass(), "time", term112439);
        setField(term112408, term112408.getClass(), "accessTime", term112434);
        setField(term112406, term112406.getClass(), "card", term112408);
        setField(term112406, term112406.getClass(), "userName", "HiMyMWtfDT");
        setIntField(term112457, term112457.getClass(), "year", 2018);
        setShortField(term112457, term112457.getClass(), "month", (short) 12);
        setShortField(term112457, term112457.getClass(), "day", (short) 13);
        setField(term112456, term112456.getClass(), "date", term112457);
        setByteField(term112461, term112461.getClass(), "hour", (byte) 13);
        setByteField(term112461, term112461.getClass(), "minute", (byte) 46);
        setByteField(term112461, term112461.getClass(), "second", (byte) 33);
        setIntField(term112461, term112461.getClass(), "nano", 393900866);
        setField(term112456, term112456.getClass(), "time", term112461);
        setField(term112406, term112406.getClass(), "lastLoginDate", term112456);
        setBooleanField(term112406, term112406.getClass(), "isWebJoin", true);
        setField(term112406, term112406.getClass(), "webLimitDate", "bTxfZATYLW");
        setIntField(term112406, term112406.getClass(), "level", 456312486);
        setIntField(term112406, term112406.getClass(), "reincarnationNum", 1799058363);
        setField(term112406, term112406.getClass(), "exp", "lFWdVTokyG");
        setLongField(term112406, term112406.getClass(), "point", -9073316743711770921L);
        setLongField(term112406, term112406.getClass(), "totalPoint", -7516961291260914620L);
        setIntField(term112406, term112406.getClass(), "playCount", 216003694);
        setIntField(term112406, term112406.getClass(), "multiPlayCount", -1542784975);
        setIntField(term112406, term112406.getClass(), "multiWinCount", 1798581458);
        setIntField(term112406, term112406.getClass(), "requestResCount", -151417122);
        setIntField(term112406, term112406.getClass(), "acceptResCount", -2013771268);
        setIntField(term112406, term112406.getClass(), "successResCount", 549034622);
        setIntField(term112406, term112406.getClass(), "playerRating", 744233731);
        setIntField(term112406, term112406.getClass(), "highestRating", 744742162);
        setIntField(term112406, term112406.getClass(), "nameplateId", 482514787);
        setIntField(term112406, term112406.getClass(), "frameId", -1042782085);
        setIntField(term112406, term112406.getClass(), "characterId", -1231956438);
        setIntField(term112406, term112406.getClass(), "trophyId", 1392725436);
        setIntField(term112406, term112406.getClass(), "playedTutorialBit", 1678969110);
        setIntField(term112406, term112406.getClass(), "firstTutorialCancelNum", -312665712);
        setIntField(term112406, term112406.getClass(), "masterTutorialCancelNum", 1022077229);
        setIntField(term112406, term112406.getClass(), "totalRepertoireCount", -1336430287);
        setIntField(term112406, term112406.getClass(), "totalMapNum", 1614467489);
        setLongField(term112406, term112406.getClass(), "totalHiScore", -6335495755419361090L);
        setLongField(term112406, term112406.getClass(), "totalBasicHighScore", 3290227196375641723L);
        setLongField(term112406, term112406.getClass(), "totalAdvancedHighScore", 1801519101190376402L);
        setLongField(term112406, term112406.getClass(), "totalExpertHighScore", 2662948409033106270L);
        setLongField(term112406, term112406.getClass(), "totalMasterHighScore", 2498989652284962947L);
        setIntField(term112518, term112518.getClass(), "year", 2016);
        setShortField(term112518, term112518.getClass(), "month", (short) 5);
        setShortField(term112518, term112518.getClass(), "day", (short) 17);
        setField(term112517, term112517.getClass(), "date", term112518);
        setByteField(term112522, term112522.getClass(), "hour", (byte) 18);
        setByteField(term112522, term112522.getClass(), "minute", (byte) 43);
        setByteField(term112522, term112522.getClass(), "second", (byte) 39);
        setIntField(term112522, term112522.getClass(), "nano", 108025449);
        setField(term112517, term112517.getClass(), "time", term112522);
        setField(term112406, term112406.getClass(), "eventWatchedDate", term112517);
        setIntField(term112406, term112406.getClass(), "friendCount", 1306583181);
        setBooleanField(term112406, term112406.getClass(), "isMaimai", false);
        setField(term112406, term112406.getClass(), "firstGameId", "PwXoorKXoP");
        setField(term112406, term112406.getClass(), "firstRomVersion", "FTbhYKJKQL");
        setField(term112406, term112406.getClass(), "firstDataVersion", "CssqWIyxap");
        setIntField(term112566, term112566.getClass(), "year", 2027);
        setShortField(term112566, term112566.getClass(), "month", (short) 9);
        setShortField(term112566, term112566.getClass(), "day", (short) 27);
        setField(term112565, term112565.getClass(), "date", term112566);
        setByteField(term112570, term112570.getClass(), "hour", (byte) 10);
        setByteField(term112570, term112570.getClass(), "minute", (byte) 43);
        setByteField(term112570, term112570.getClass(), "second", (byte) 29);
        setIntField(term112570, term112570.getClass(), "nano", 255303093);
        setField(term112565, term112565.getClass(), "time", term112570);
        setField(term112406, term112406.getClass(), "firstPlayDate", term112565);
        setField(term112406, term112406.getClass(), "lastGameId", "EtmaqZMoVN");
        setField(term112406, term112406.getClass(), "lastRomVersion", "mluXYJByNP");
        setField(term112406, term112406.getClass(), "lastDataVersion", "kLMqANSDgO");
        setIntField(term112612, term112612.getClass(), "year", 2015);
        setShortField(term112612, term112612.getClass(), "month", (short) 10);
        setShortField(term112612, term112612.getClass(), "day", (short) 27);
        setField(term112611, term112611.getClass(), "date", term112612);
        setByteField(term112616, term112616.getClass(), "hour", (byte) 5);
        setByteField(term112616, term112616.getClass(), "minute", (byte) 21);
        setByteField(term112616, term112616.getClass(), "second", (byte) 50);
        setIntField(term112616, term112616.getClass(), "nano", 795619735);
        setField(term112611, term112611.getClass(), "time", term112616);
        setField(term112406, term112406.getClass(), "lastPlayDate", term112611);
        setIntField(term112406, term112406.getClass(), "lastPlaceId", -1162066181);
        setField(term112406, term112406.getClass(), "lastPlaceName", "nStYnHGCom");
        setField(term112406, term112406.getClass(), "lastRegionId", "gfqZitqjcH");
        setField(term112406, term112406.getClass(), "lastRegionName", "QfJOLCTCHY");
        setField(term112406, term112406.getClass(), "lastAllNetId", "yNQuuhZyAX");
        setField(term112406, term112406.getClass(), "lastClientId", "IqzRlGAXKQ");
        setField(term112404, term112404.getClass(), "user", term112406);
        setIntField(term112404, term112404.getClass(), "characterId", 1058566964);
        setIntField(term112404, term112404.getClass(), "playCount", 349842396);
        setIntField(term112404, term112404.getClass(), "level", 1);
        setIntField(term112404, term112404.getClass(), "skillId", 1156977610);
        setIntField(term112404, term112404.getClass(), "friendshipExp", -800343585);
        setBooleanField(term112404, term112404.getClass(), "isValid", true);
        setBooleanField(term112404, term112404.getClass(), "isNewMark", true);
        setIntField(term112404, term112404.getClass(), "param1", 1248328125);
        setIntField(term112404, term112404.getClass(), "param2", 395562077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam1", argTypes, term112404, args);
    }

};


