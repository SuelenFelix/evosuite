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

public class UserCharacter_setParam1_61153051621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117653;
     Object term117940;

    public UserCharacter_setParam1_61153051621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term117659 = new Long(-2955854401507097864L);
        term117653 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term117655 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term117657 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term117673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117683 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117684 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117688 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117819 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117865 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term117653, term117653.getClass(), "id", -5492665078635116313L);
        setLongField(term117655, term117655.getClass(), "id", -6642317903316072178L);
        setLongField(term117657, term117657.getClass(), "id", -8663415403140355626L);
        setField(term117657, term117657.getClass(), "extId", term117659);
        setField(term117657, term117657.getClass(), "luid", "FsjVOWFhLi");
        setIntField(term117674, term117674.getClass(), "year", 2023);
        setShortField(term117674, term117674.getClass(), "month", (short) 10);
        setShortField(term117674, term117674.getClass(), "day", (short) 3);
        setField(term117673, term117673.getClass(), "date", term117674);
        setByteField(term117678, term117678.getClass(), "hour", (byte) 12);
        setByteField(term117678, term117678.getClass(), "minute", (byte) 9);
        setByteField(term117678, term117678.getClass(), "second", (byte) 7);
        setIntField(term117678, term117678.getClass(), "nano", 486463028);
        setField(term117673, term117673.getClass(), "time", term117678);
        setField(term117657, term117657.getClass(), "registerTime", term117673);
        setIntField(term117684, term117684.getClass(), "year", 2026);
        setShortField(term117684, term117684.getClass(), "month", (short) 3);
        setShortField(term117684, term117684.getClass(), "day", (short) 23);
        setField(term117683, term117683.getClass(), "date", term117684);
        setByteField(term117688, term117688.getClass(), "hour", (byte) 15);
        setByteField(term117688, term117688.getClass(), "minute", (byte) 45);
        setByteField(term117688, term117688.getClass(), "second", (byte) 3);
        setIntField(term117688, term117688.getClass(), "nano", 712034652);
        setField(term117683, term117683.getClass(), "time", term117688);
        setField(term117657, term117657.getClass(), "accessTime", term117683);
        setField(term117655, term117655.getClass(), "card", term117657);
        setField(term117655, term117655.getClass(), "userName", "RReQXZQnIR");
        setIntField(term117706, term117706.getClass(), "year", 2013);
        setShortField(term117706, term117706.getClass(), "month", (short) 12);
        setShortField(term117706, term117706.getClass(), "day", (short) 7);
        setField(term117705, term117705.getClass(), "date", term117706);
        setByteField(term117710, term117710.getClass(), "hour", (byte) 23);
        setByteField(term117710, term117710.getClass(), "minute", (byte) 33);
        setByteField(term117710, term117710.getClass(), "second", (byte) 8);
        setIntField(term117710, term117710.getClass(), "nano", 995839786);
        setField(term117705, term117705.getClass(), "time", term117710);
        setField(term117655, term117655.getClass(), "lastLoginDate", term117705);
        setBooleanField(term117655, term117655.getClass(), "isWebJoin", true);
        setField(term117655, term117655.getClass(), "webLimitDate", "VnHgyPgIAn");
        setIntField(term117655, term117655.getClass(), "level", -992293515);
        setIntField(term117655, term117655.getClass(), "reincarnationNum", -941799505);
        setField(term117655, term117655.getClass(), "exp", "EIkLuLTIDO");
        setLongField(term117655, term117655.getClass(), "point", -6164870242783962017L);
        setLongField(term117655, term117655.getClass(), "totalPoint", -852178810374130490L);
        setIntField(term117655, term117655.getClass(), "playCount", -490855781);
        setIntField(term117655, term117655.getClass(), "multiPlayCount", -1019146708);
        setIntField(term117655, term117655.getClass(), "multiWinCount", -1659254800);
        setIntField(term117655, term117655.getClass(), "requestResCount", 1069040713);
        setIntField(term117655, term117655.getClass(), "acceptResCount", -932319157);
        setIntField(term117655, term117655.getClass(), "successResCount", 2096486142);
        setIntField(term117655, term117655.getClass(), "playerRating", 1814053301);
        setIntField(term117655, term117655.getClass(), "highestRating", -1145940584);
        setIntField(term117655, term117655.getClass(), "nameplateId", 1759520462);
        setIntField(term117655, term117655.getClass(), "frameId", -450055049);
        setIntField(term117655, term117655.getClass(), "characterId", -2139747712);
        setIntField(term117655, term117655.getClass(), "trophyId", -60712376);
        setIntField(term117655, term117655.getClass(), "playedTutorialBit", 1374935274);
        setIntField(term117655, term117655.getClass(), "firstTutorialCancelNum", 1063935111);
        setIntField(term117655, term117655.getClass(), "masterTutorialCancelNum", 1742675635);
        setIntField(term117655, term117655.getClass(), "totalRepertoireCount", 1406898507);
        setIntField(term117655, term117655.getClass(), "totalMapNum", -28514280);
        setLongField(term117655, term117655.getClass(), "totalHiScore", 3557402050530427336L);
        setLongField(term117655, term117655.getClass(), "totalBasicHighScore", -8153392834863780469L);
        setLongField(term117655, term117655.getClass(), "totalAdvancedHighScore", 2099475006510474987L);
        setLongField(term117655, term117655.getClass(), "totalExpertHighScore", 8670871793677477111L);
        setLongField(term117655, term117655.getClass(), "totalMasterHighScore", 1849019432435290766L);
        setIntField(term117767, term117767.getClass(), "year", 2029);
        setShortField(term117767, term117767.getClass(), "month", (short) 6);
        setShortField(term117767, term117767.getClass(), "day", (short) 25);
        setField(term117766, term117766.getClass(), "date", term117767);
        setByteField(term117771, term117771.getClass(), "hour", (byte) 13);
        setByteField(term117771, term117771.getClass(), "minute", (byte) 19);
        setByteField(term117771, term117771.getClass(), "second", (byte) 14);
        setIntField(term117771, term117771.getClass(), "nano", 144413166);
        setField(term117766, term117766.getClass(), "time", term117771);
        setField(term117655, term117655.getClass(), "eventWatchedDate", term117766);
        setIntField(term117655, term117655.getClass(), "friendCount", 313319336);
        setBooleanField(term117655, term117655.getClass(), "isMaimai", false);
        setField(term117655, term117655.getClass(), "firstGameId", "rQFJbYZksA");
        setField(term117655, term117655.getClass(), "firstRomVersion", "jndrnlnwbO");
        setField(term117655, term117655.getClass(), "firstDataVersion", "qdFzHeHbQc");
        setIntField(term117815, term117815.getClass(), "year", 2023);
        setShortField(term117815, term117815.getClass(), "month", (short) 8);
        setShortField(term117815, term117815.getClass(), "day", (short) 6);
        setField(term117814, term117814.getClass(), "date", term117815);
        setByteField(term117819, term117819.getClass(), "hour", (byte) 14);
        setByteField(term117819, term117819.getClass(), "minute", (byte) 47);
        setByteField(term117819, term117819.getClass(), "second", (byte) 25);
        setIntField(term117819, term117819.getClass(), "nano", 351418783);
        setField(term117814, term117814.getClass(), "time", term117819);
        setField(term117655, term117655.getClass(), "firstPlayDate", term117814);
        setField(term117655, term117655.getClass(), "lastGameId", "EcxYliBmNQ");
        setField(term117655, term117655.getClass(), "lastRomVersion", "MGbwgunHMQ");
        setField(term117655, term117655.getClass(), "lastDataVersion", "wCgQVdppSI");
        setIntField(term117861, term117861.getClass(), "year", 2022);
        setShortField(term117861, term117861.getClass(), "month", (short) 10);
        setShortField(term117861, term117861.getClass(), "day", (short) 26);
        setField(term117860, term117860.getClass(), "date", term117861);
        setByteField(term117865, term117865.getClass(), "hour", (byte) 13);
        setByteField(term117865, term117865.getClass(), "minute", (byte) 54);
        setByteField(term117865, term117865.getClass(), "second", (byte) 46);
        setIntField(term117865, term117865.getClass(), "nano", 30247781);
        setField(term117860, term117860.getClass(), "time", term117865);
        setField(term117655, term117655.getClass(), "lastPlayDate", term117860);
        setIntField(term117655, term117655.getClass(), "lastPlaceId", -335338628);
        setField(term117655, term117655.getClass(), "lastPlaceName", "oQWxaFnrYq");
        setField(term117655, term117655.getClass(), "lastRegionId", "uZcUOSgoMp");
        setField(term117655, term117655.getClass(), "lastRegionName", "eMxNpewLIS");
        setField(term117655, term117655.getClass(), "lastAllNetId", "GxNdoXawUZ");
        setField(term117655, term117655.getClass(), "lastClientId", "YAFTYAtere");
        setField(term117653, term117653.getClass(), "user", term117655);
        setIntField(term117653, term117653.getClass(), "characterId", 1539132721);
        setIntField(term117653, term117653.getClass(), "playCount", -564177085);
        setIntField(term117653, term117653.getClass(), "level", 1);
        setIntField(term117653, term117653.getClass(), "skillId", 1951006294);
        setIntField(term117653, term117653.getClass(), "friendshipExp", 315490614);
        setBooleanField(term117653, term117653.getClass(), "isValid", true);
        setBooleanField(term117653, term117653.getClass(), "isNewMark", true);
        setIntField(term117653, term117653.getClass(), "param1", -181204804);
        setIntField(term117653, term117653.getClass(), "param2", 2073462223);
        term117940 = new Integer(509141438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term117940;
        callMethod(klass, "setParam1", argTypes, term117653, args);
    }

};


