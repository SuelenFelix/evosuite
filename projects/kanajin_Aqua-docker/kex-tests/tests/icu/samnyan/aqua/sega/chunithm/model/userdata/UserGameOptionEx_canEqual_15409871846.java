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

public class UserGameOptionEx_canEqual_15409871846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330660;
     Object term330958;

    public UserGameOptionEx_canEqual_15409871846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term330666 = new Long(2054808971423494757L);
        term330660 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term330662 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term330664 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term330680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330685 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330717 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330778 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330872 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term330660, term330660.getClass(), "id", 1278060485580511930L);
        setLongField(term330662, term330662.getClass(), "id", -7729614411633305187L);
        setLongField(term330664, term330664.getClass(), "id", 7287180051933066596L);
        setField(term330664, term330664.getClass(), "extId", term330666);
        setField(term330664, term330664.getClass(), "luid", "wzNXDSGHuN");
        setIntField(term330681, term330681.getClass(), "year", 2017);
        setShortField(term330681, term330681.getClass(), "month", (short) 11);
        setShortField(term330681, term330681.getClass(), "day", (short) 16);
        setField(term330680, term330680.getClass(), "date", term330681);
        setByteField(term330685, term330685.getClass(), "hour", (byte) 14);
        setByteField(term330685, term330685.getClass(), "minute", (byte) 29);
        setByteField(term330685, term330685.getClass(), "second", (byte) 26);
        setIntField(term330685, term330685.getClass(), "nano", 867292661);
        setField(term330680, term330680.getClass(), "time", term330685);
        setField(term330664, term330664.getClass(), "registerTime", term330680);
        setIntField(term330691, term330691.getClass(), "year", 2022);
        setShortField(term330691, term330691.getClass(), "month", (short) 7);
        setShortField(term330691, term330691.getClass(), "day", (short) 6);
        setField(term330690, term330690.getClass(), "date", term330691);
        setByteField(term330695, term330695.getClass(), "hour", (byte) 16);
        setByteField(term330695, term330695.getClass(), "minute", (byte) 16);
        setByteField(term330695, term330695.getClass(), "second", (byte) 12);
        setIntField(term330695, term330695.getClass(), "nano", 344097729);
        setField(term330690, term330690.getClass(), "time", term330695);
        setField(term330664, term330664.getClass(), "accessTime", term330690);
        setField(term330662, term330662.getClass(), "card", term330664);
        setField(term330662, term330662.getClass(), "userName", "ChYSlyHfwK");
        setIntField(term330713, term330713.getClass(), "year", 2027);
        setShortField(term330713, term330713.getClass(), "month", (short) 2);
        setShortField(term330713, term330713.getClass(), "day", (short) 27);
        setField(term330712, term330712.getClass(), "date", term330713);
        setByteField(term330717, term330717.getClass(), "hour", (byte) 16);
        setByteField(term330717, term330717.getClass(), "minute", (byte) 23);
        setByteField(term330717, term330717.getClass(), "second", (byte) 54);
        setIntField(term330717, term330717.getClass(), "nano", 891355890);
        setField(term330712, term330712.getClass(), "time", term330717);
        setField(term330662, term330662.getClass(), "lastLoginDate", term330712);
        setBooleanField(term330662, term330662.getClass(), "isWebJoin", false);
        setField(term330662, term330662.getClass(), "webLimitDate", "WONvayWNCs");
        setIntField(term330662, term330662.getClass(), "level", -1191583321);
        setIntField(term330662, term330662.getClass(), "reincarnationNum", -786138280);
        setField(term330662, term330662.getClass(), "exp", "FyzhCvaPBp");
        setLongField(term330662, term330662.getClass(), "point", 5646115203911352916L);
        setLongField(term330662, term330662.getClass(), "totalPoint", 169327056621903152L);
        setIntField(term330662, term330662.getClass(), "playCount", -3291737);
        setIntField(term330662, term330662.getClass(), "multiPlayCount", -1120251247);
        setIntField(term330662, term330662.getClass(), "multiWinCount", 1019780409);
        setIntField(term330662, term330662.getClass(), "requestResCount", 915359411);
        setIntField(term330662, term330662.getClass(), "acceptResCount", -573058487);
        setIntField(term330662, term330662.getClass(), "successResCount", -1261761217);
        setIntField(term330662, term330662.getClass(), "playerRating", -534235681);
        setIntField(term330662, term330662.getClass(), "highestRating", -2114475651);
        setIntField(term330662, term330662.getClass(), "nameplateId", 1552583328);
        setIntField(term330662, term330662.getClass(), "frameId", 1622154069);
        setIntField(term330662, term330662.getClass(), "characterId", 1548044851);
        setIntField(term330662, term330662.getClass(), "trophyId", 215408563);
        setIntField(term330662, term330662.getClass(), "playedTutorialBit", -1059027826);
        setIntField(term330662, term330662.getClass(), "firstTutorialCancelNum", -258971435);
        setIntField(term330662, term330662.getClass(), "masterTutorialCancelNum", 376021891);
        setIntField(term330662, term330662.getClass(), "totalRepertoireCount", -1137877214);
        setIntField(term330662, term330662.getClass(), "totalMapNum", 397269499);
        setLongField(term330662, term330662.getClass(), "totalHiScore", -2295704228460481812L);
        setLongField(term330662, term330662.getClass(), "totalBasicHighScore", 3646546264522810551L);
        setLongField(term330662, term330662.getClass(), "totalAdvancedHighScore", 4896856838451272148L);
        setLongField(term330662, term330662.getClass(), "totalExpertHighScore", 4710935698592379616L);
        setLongField(term330662, term330662.getClass(), "totalMasterHighScore", -9125213887622226318L);
        setIntField(term330774, term330774.getClass(), "year", 2014);
        setShortField(term330774, term330774.getClass(), "month", (short) 9);
        setShortField(term330774, term330774.getClass(), "day", (short) 7);
        setField(term330773, term330773.getClass(), "date", term330774);
        setByteField(term330778, term330778.getClass(), "hour", (byte) 10);
        setByteField(term330778, term330778.getClass(), "minute", (byte) 12);
        setByteField(term330778, term330778.getClass(), "second", (byte) 0);
        setIntField(term330778, term330778.getClass(), "nano", 610967332);
        setField(term330773, term330773.getClass(), "time", term330778);
        setField(term330662, term330662.getClass(), "eventWatchedDate", term330773);
        setIntField(term330662, term330662.getClass(), "friendCount", -1700540543);
        setBooleanField(term330662, term330662.getClass(), "isMaimai", false);
        setField(term330662, term330662.getClass(), "firstGameId", "XAyaTiPVgp");
        setField(term330662, term330662.getClass(), "firstRomVersion", "thjLrSQRdq");
        setField(term330662, term330662.getClass(), "firstDataVersion", "fAdWwXotkA");
        setIntField(term330822, term330822.getClass(), "year", 2012);
        setShortField(term330822, term330822.getClass(), "month", (short) 7);
        setShortField(term330822, term330822.getClass(), "day", (short) 20);
        setField(term330821, term330821.getClass(), "date", term330822);
        setByteField(term330826, term330826.getClass(), "hour", (byte) 17);
        setByteField(term330826, term330826.getClass(), "minute", (byte) 20);
        setByteField(term330826, term330826.getClass(), "second", (byte) 32);
        setIntField(term330826, term330826.getClass(), "nano", 452342777);
        setField(term330821, term330821.getClass(), "time", term330826);
        setField(term330662, term330662.getClass(), "firstPlayDate", term330821);
        setField(term330662, term330662.getClass(), "lastGameId", "bviXUjxTVM");
        setField(term330662, term330662.getClass(), "lastRomVersion", "kchlDlnXwq");
        setField(term330662, term330662.getClass(), "lastDataVersion", "bIRvjZZUjf");
        setIntField(term330868, term330868.getClass(), "year", 2023);
        setShortField(term330868, term330868.getClass(), "month", (short) 7);
        setShortField(term330868, term330868.getClass(), "day", (short) 9);
        setField(term330867, term330867.getClass(), "date", term330868);
        setByteField(term330872, term330872.getClass(), "hour", (byte) 21);
        setByteField(term330872, term330872.getClass(), "minute", (byte) 39);
        setByteField(term330872, term330872.getClass(), "second", (byte) 0);
        setIntField(term330872, term330872.getClass(), "nano", 740232600);
        setField(term330867, term330867.getClass(), "time", term330872);
        setField(term330662, term330662.getClass(), "lastPlayDate", term330867);
        setIntField(term330662, term330662.getClass(), "lastPlaceId", 506881476);
        setField(term330662, term330662.getClass(), "lastPlaceName", "BehfSbxgxB");
        setField(term330662, term330662.getClass(), "lastRegionId", "wjLowxXqMV");
        setField(term330662, term330662.getClass(), "lastRegionName", "ZKmgqtnyWl");
        setField(term330662, term330662.getClass(), "lastAllNetId", "jbKfSPsbrl");
        setField(term330662, term330662.getClass(), "lastClientId", "cgnSRPOCMZ");
        setField(term330660, term330660.getClass(), "user", term330662);
        setIntField(term330660, term330660.getClass(), "ext1", 1397652046);
        setIntField(term330660, term330660.getClass(), "ext2", 1289575397);
        setIntField(term330660, term330660.getClass(), "ext3", -350892455);
        setIntField(term330660, term330660.getClass(), "ext4", 1362938566);
        setIntField(term330660, term330660.getClass(), "ext5", -2146906732);
        setIntField(term330660, term330660.getClass(), "ext6", 2145739450);
        setIntField(term330660, term330660.getClass(), "ext7", -1839352479);
        setIntField(term330660, term330660.getClass(), "ext8", -1098195799);
        setIntField(term330660, term330660.getClass(), "ext9", 671472274);
        setIntField(term330660, term330660.getClass(), "ext10", -750202903);
        setIntField(term330660, term330660.getClass(), "ext11", 1929857446);
        setIntField(term330660, term330660.getClass(), "ext12", 1948574607);
        setIntField(term330660, term330660.getClass(), "ext13", 939357638);
        setIntField(term330660, term330660.getClass(), "ext14", 623776950);
        setIntField(term330660, term330660.getClass(), "ext15", 227747203);
        setIntField(term330660, term330660.getClass(), "ext16", -1162118510);
        setIntField(term330660, term330660.getClass(), "ext17", -1879053707);
        setIntField(term330660, term330660.getClass(), "ext18", 358568525);
        setIntField(term330660, term330660.getClass(), "ext19", 365320480);
        setIntField(term330660, term330660.getClass(), "ext20", -1535541256);
        term330958 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term330958;
        callMethod(klass, "canEqual", argTypes, term330660, args);
    }

};


