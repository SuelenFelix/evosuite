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

public class UserCharacter_equals_117037999823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118531;
     Object term118818;

    public UserCharacter_equals_117037999823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term118537 = new Long(8107921244631636572L);
        term118531 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term118533 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term118535 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term118551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118556 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118584 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118588 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118649 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118743 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term118531, term118531.getClass(), "id", -700098407024972610L);
        setLongField(term118533, term118533.getClass(), "id", 8346130120381478068L);
        setLongField(term118535, term118535.getClass(), "id", -2325777595445399907L);
        setField(term118535, term118535.getClass(), "extId", term118537);
        setField(term118535, term118535.getClass(), "luid", "uRfXEtHgIt");
        setIntField(term118552, term118552.getClass(), "year", 2029);
        setShortField(term118552, term118552.getClass(), "month", (short) 8);
        setShortField(term118552, term118552.getClass(), "day", (short) 24);
        setField(term118551, term118551.getClass(), "date", term118552);
        setByteField(term118556, term118556.getClass(), "hour", (byte) 16);
        setByteField(term118556, term118556.getClass(), "minute", (byte) 57);
        setByteField(term118556, term118556.getClass(), "second", (byte) 12);
        setIntField(term118556, term118556.getClass(), "nano", 555196978);
        setField(term118551, term118551.getClass(), "time", term118556);
        setField(term118535, term118535.getClass(), "registerTime", term118551);
        setIntField(term118562, term118562.getClass(), "year", 2027);
        setShortField(term118562, term118562.getClass(), "month", (short) 6);
        setShortField(term118562, term118562.getClass(), "day", (short) 28);
        setField(term118561, term118561.getClass(), "date", term118562);
        setByteField(term118566, term118566.getClass(), "hour", (byte) 8);
        setByteField(term118566, term118566.getClass(), "minute", (byte) 14);
        setByteField(term118566, term118566.getClass(), "second", (byte) 0);
        setIntField(term118566, term118566.getClass(), "nano", 347823714);
        setField(term118561, term118561.getClass(), "time", term118566);
        setField(term118535, term118535.getClass(), "accessTime", term118561);
        setField(term118533, term118533.getClass(), "card", term118535);
        setField(term118533, term118533.getClass(), "userName", "lzrbwfKykX");
        setIntField(term118584, term118584.getClass(), "year", 2012);
        setShortField(term118584, term118584.getClass(), "month", (short) 11);
        setShortField(term118584, term118584.getClass(), "day", (short) 3);
        setField(term118583, term118583.getClass(), "date", term118584);
        setByteField(term118588, term118588.getClass(), "hour", (byte) 5);
        setByteField(term118588, term118588.getClass(), "minute", (byte) 57);
        setByteField(term118588, term118588.getClass(), "second", (byte) 38);
        setIntField(term118588, term118588.getClass(), "nano", 147251565);
        setField(term118583, term118583.getClass(), "time", term118588);
        setField(term118533, term118533.getClass(), "lastLoginDate", term118583);
        setBooleanField(term118533, term118533.getClass(), "isWebJoin", false);
        setField(term118533, term118533.getClass(), "webLimitDate", "eZWnfePnkp");
        setIntField(term118533, term118533.getClass(), "level", -851263541);
        setIntField(term118533, term118533.getClass(), "reincarnationNum", 1001758052);
        setField(term118533, term118533.getClass(), "exp", "BSdXqptUKz");
        setLongField(term118533, term118533.getClass(), "point", -3514785447628222010L);
        setLongField(term118533, term118533.getClass(), "totalPoint", -5108468977208772556L);
        setIntField(term118533, term118533.getClass(), "playCount", -1481470185);
        setIntField(term118533, term118533.getClass(), "multiPlayCount", -1112833662);
        setIntField(term118533, term118533.getClass(), "multiWinCount", -944322051);
        setIntField(term118533, term118533.getClass(), "requestResCount", 986554477);
        setIntField(term118533, term118533.getClass(), "acceptResCount", 1420310686);
        setIntField(term118533, term118533.getClass(), "successResCount", -1255448879);
        setIntField(term118533, term118533.getClass(), "playerRating", -332881327);
        setIntField(term118533, term118533.getClass(), "highestRating", -314472912);
        setIntField(term118533, term118533.getClass(), "nameplateId", -2084560012);
        setIntField(term118533, term118533.getClass(), "frameId", 910881174);
        setIntField(term118533, term118533.getClass(), "characterId", -1917095576);
        setIntField(term118533, term118533.getClass(), "trophyId", 1449306932);
        setIntField(term118533, term118533.getClass(), "playedTutorialBit", 56212143);
        setIntField(term118533, term118533.getClass(), "firstTutorialCancelNum", 618002074);
        setIntField(term118533, term118533.getClass(), "masterTutorialCancelNum", -1239775423);
        setIntField(term118533, term118533.getClass(), "totalRepertoireCount", -885203807);
        setIntField(term118533, term118533.getClass(), "totalMapNum", -644989552);
        setLongField(term118533, term118533.getClass(), "totalHiScore", 505876240564658953L);
        setLongField(term118533, term118533.getClass(), "totalBasicHighScore", 7742764755721559987L);
        setLongField(term118533, term118533.getClass(), "totalAdvancedHighScore", -8991703742842083780L);
        setLongField(term118533, term118533.getClass(), "totalExpertHighScore", 5615941840917152622L);
        setLongField(term118533, term118533.getClass(), "totalMasterHighScore", -4465594170502445650L);
        setIntField(term118645, term118645.getClass(), "year", 2021);
        setShortField(term118645, term118645.getClass(), "month", (short) 11);
        setShortField(term118645, term118645.getClass(), "day", (short) 27);
        setField(term118644, term118644.getClass(), "date", term118645);
        setByteField(term118649, term118649.getClass(), "hour", (byte) 17);
        setByteField(term118649, term118649.getClass(), "minute", (byte) 43);
        setByteField(term118649, term118649.getClass(), "second", (byte) 51);
        setIntField(term118649, term118649.getClass(), "nano", 787947149);
        setField(term118644, term118644.getClass(), "time", term118649);
        setField(term118533, term118533.getClass(), "eventWatchedDate", term118644);
        setIntField(term118533, term118533.getClass(), "friendCount", -806442678);
        setBooleanField(term118533, term118533.getClass(), "isMaimai", false);
        setField(term118533, term118533.getClass(), "firstGameId", "UtzMtwAaid");
        setField(term118533, term118533.getClass(), "firstRomVersion", "bchxgKxuUf");
        setField(term118533, term118533.getClass(), "firstDataVersion", "mjXKuwKUyR");
        setIntField(term118693, term118693.getClass(), "year", 2015);
        setShortField(term118693, term118693.getClass(), "month", (short) 4);
        setShortField(term118693, term118693.getClass(), "day", (short) 2);
        setField(term118692, term118692.getClass(), "date", term118693);
        setByteField(term118697, term118697.getClass(), "hour", (byte) 16);
        setByteField(term118697, term118697.getClass(), "minute", (byte) 58);
        setByteField(term118697, term118697.getClass(), "second", (byte) 7);
        setIntField(term118697, term118697.getClass(), "nano", 424910939);
        setField(term118692, term118692.getClass(), "time", term118697);
        setField(term118533, term118533.getClass(), "firstPlayDate", term118692);
        setField(term118533, term118533.getClass(), "lastGameId", "UfdjcAQclb");
        setField(term118533, term118533.getClass(), "lastRomVersion", "skKLlFIRTI");
        setField(term118533, term118533.getClass(), "lastDataVersion", "SfjOvqPCwx");
        setIntField(term118739, term118739.getClass(), "year", 2024);
        setShortField(term118739, term118739.getClass(), "month", (short) 3);
        setShortField(term118739, term118739.getClass(), "day", (short) 31);
        setField(term118738, term118738.getClass(), "date", term118739);
        setByteField(term118743, term118743.getClass(), "hour", (byte) 23);
        setByteField(term118743, term118743.getClass(), "minute", (byte) 34);
        setByteField(term118743, term118743.getClass(), "second", (byte) 35);
        setIntField(term118743, term118743.getClass(), "nano", 66833920);
        setField(term118738, term118738.getClass(), "time", term118743);
        setField(term118533, term118533.getClass(), "lastPlayDate", term118738);
        setIntField(term118533, term118533.getClass(), "lastPlaceId", 1753926364);
        setField(term118533, term118533.getClass(), "lastPlaceName", "rinBVtrpcr");
        setField(term118533, term118533.getClass(), "lastRegionId", "KjCvQWfqew");
        setField(term118533, term118533.getClass(), "lastRegionName", "WewLrXvLmC");
        setField(term118533, term118533.getClass(), "lastAllNetId", "vbEYtFntxd");
        setField(term118533, term118533.getClass(), "lastClientId", "ZiYiKyRQTQ");
        setField(term118531, term118531.getClass(), "user", term118533);
        setIntField(term118531, term118531.getClass(), "characterId", 1317026070);
        setIntField(term118531, term118531.getClass(), "playCount", -1573654080);
        setIntField(term118531, term118531.getClass(), "level", 1);
        setIntField(term118531, term118531.getClass(), "skillId", 658719402);
        setIntField(term118531, term118531.getClass(), "friendshipExp", -89063392);
        setBooleanField(term118531, term118531.getClass(), "isValid", true);
        setBooleanField(term118531, term118531.getClass(), "isNewMark", true);
        setIntField(term118531, term118531.getClass(), "param1", -1511535943);
        setIntField(term118531, term118531.getClass(), "param2", 1013691868);
        term118818 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term118818;
        callMethod(klass, "equals", argTypes, term118531, args);
    }

};


