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

public class UserActivity_setId_64546189710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295748;
     Object term296033;

    public UserActivity_setId_64546189710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term295754 = new Long(4041117732464806744L);
        term295748 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term295750 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term295752 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term295768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295773 = newInstance(Class.forName("java.time.LocalTime"));
        Object term295778 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295779 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295783 = newInstance(Class.forName("java.time.LocalTime"));
        Object term295800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term295861 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295866 = newInstance(Class.forName("java.time.LocalTime"));
        Object term295909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295914 = newInstance(Class.forName("java.time.LocalTime"));
        Object term295955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295960 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term295748, term295748.getClass(), "id", 7263834083570926393L);
        setLongField(term295750, term295750.getClass(), "id", -6550458274684737650L);
        setLongField(term295752, term295752.getClass(), "id", 1974009375418734835L);
        setField(term295752, term295752.getClass(), "extId", term295754);
        setField(term295752, term295752.getClass(), "luid", "XOFlovlfIj");
        setIntField(term295769, term295769.getClass(), "year", 2013);
        setShortField(term295769, term295769.getClass(), "month", (short) 7);
        setShortField(term295769, term295769.getClass(), "day", (short) 5);
        setField(term295768, term295768.getClass(), "date", term295769);
        setByteField(term295773, term295773.getClass(), "hour", (byte) 0);
        setByteField(term295773, term295773.getClass(), "minute", (byte) 13);
        setByteField(term295773, term295773.getClass(), "second", (byte) 1);
        setIntField(term295773, term295773.getClass(), "nano", 488314235);
        setField(term295768, term295768.getClass(), "time", term295773);
        setField(term295752, term295752.getClass(), "registerTime", term295768);
        setIntField(term295779, term295779.getClass(), "year", 2019);
        setShortField(term295779, term295779.getClass(), "month", (short) 5);
        setShortField(term295779, term295779.getClass(), "day", (short) 23);
        setField(term295778, term295778.getClass(), "date", term295779);
        setByteField(term295783, term295783.getClass(), "hour", (byte) 9);
        setByteField(term295783, term295783.getClass(), "minute", (byte) 17);
        setByteField(term295783, term295783.getClass(), "second", (byte) 33);
        setIntField(term295783, term295783.getClass(), "nano", 177436370);
        setField(term295778, term295778.getClass(), "time", term295783);
        setField(term295752, term295752.getClass(), "accessTime", term295778);
        setField(term295750, term295750.getClass(), "card", term295752);
        setField(term295750, term295750.getClass(), "userName", "gdTreEAwDY");
        setIntField(term295801, term295801.getClass(), "year", 2023);
        setShortField(term295801, term295801.getClass(), "month", (short) 4);
        setShortField(term295801, term295801.getClass(), "day", (short) 11);
        setField(term295800, term295800.getClass(), "date", term295801);
        setByteField(term295805, term295805.getClass(), "hour", (byte) 4);
        setByteField(term295805, term295805.getClass(), "minute", (byte) 26);
        setByteField(term295805, term295805.getClass(), "second", (byte) 27);
        setIntField(term295805, term295805.getClass(), "nano", 104617424);
        setField(term295800, term295800.getClass(), "time", term295805);
        setField(term295750, term295750.getClass(), "lastLoginDate", term295800);
        setBooleanField(term295750, term295750.getClass(), "isWebJoin", false);
        setField(term295750, term295750.getClass(), "webLimitDate", "JEuvsJnhAW");
        setIntField(term295750, term295750.getClass(), "level", -1293180900);
        setIntField(term295750, term295750.getClass(), "reincarnationNum", -1320940649);
        setField(term295750, term295750.getClass(), "exp", "qrIWqPjdov");
        setLongField(term295750, term295750.getClass(), "point", 7308123421897565677L);
        setLongField(term295750, term295750.getClass(), "totalPoint", -4342562926436615897L);
        setIntField(term295750, term295750.getClass(), "playCount", 129458680);
        setIntField(term295750, term295750.getClass(), "multiPlayCount", 947006863);
        setIntField(term295750, term295750.getClass(), "multiWinCount", -893561872);
        setIntField(term295750, term295750.getClass(), "requestResCount", 1277858599);
        setIntField(term295750, term295750.getClass(), "acceptResCount", 2102505859);
        setIntField(term295750, term295750.getClass(), "successResCount", 472937435);
        setIntField(term295750, term295750.getClass(), "playerRating", -583961320);
        setIntField(term295750, term295750.getClass(), "highestRating", -2059122590);
        setIntField(term295750, term295750.getClass(), "nameplateId", 1635028602);
        setIntField(term295750, term295750.getClass(), "frameId", -1584646798);
        setIntField(term295750, term295750.getClass(), "characterId", 1012072498);
        setIntField(term295750, term295750.getClass(), "trophyId", -605073258);
        setIntField(term295750, term295750.getClass(), "playedTutorialBit", 189747070);
        setIntField(term295750, term295750.getClass(), "firstTutorialCancelNum", -1829678263);
        setIntField(term295750, term295750.getClass(), "masterTutorialCancelNum", 101338111);
        setIntField(term295750, term295750.getClass(), "totalRepertoireCount", -1477832518);
        setIntField(term295750, term295750.getClass(), "totalMapNum", 1121488723);
        setLongField(term295750, term295750.getClass(), "totalHiScore", 8435193238410123800L);
        setLongField(term295750, term295750.getClass(), "totalBasicHighScore", 5942903947023249939L);
        setLongField(term295750, term295750.getClass(), "totalAdvancedHighScore", 5691134758421980957L);
        setLongField(term295750, term295750.getClass(), "totalExpertHighScore", -7425210775721443271L);
        setLongField(term295750, term295750.getClass(), "totalMasterHighScore", 922585489945514753L);
        setIntField(term295862, term295862.getClass(), "year", 2024);
        setShortField(term295862, term295862.getClass(), "month", (short) 7);
        setShortField(term295862, term295862.getClass(), "day", (short) 20);
        setField(term295861, term295861.getClass(), "date", term295862);
        setByteField(term295866, term295866.getClass(), "hour", (byte) 1);
        setByteField(term295866, term295866.getClass(), "minute", (byte) 20);
        setByteField(term295866, term295866.getClass(), "second", (byte) 7);
        setIntField(term295866, term295866.getClass(), "nano", 880787225);
        setField(term295861, term295861.getClass(), "time", term295866);
        setField(term295750, term295750.getClass(), "eventWatchedDate", term295861);
        setIntField(term295750, term295750.getClass(), "friendCount", 1759141083);
        setBooleanField(term295750, term295750.getClass(), "isMaimai", false);
        setField(term295750, term295750.getClass(), "firstGameId", "chPkouOrOD");
        setField(term295750, term295750.getClass(), "firstRomVersion", "VKPVssVIga");
        setField(term295750, term295750.getClass(), "firstDataVersion", "iskHdVFxha");
        setIntField(term295910, term295910.getClass(), "year", 2025);
        setShortField(term295910, term295910.getClass(), "month", (short) 8);
        setShortField(term295910, term295910.getClass(), "day", (short) 2);
        setField(term295909, term295909.getClass(), "date", term295910);
        setByteField(term295914, term295914.getClass(), "hour", (byte) 11);
        setByteField(term295914, term295914.getClass(), "minute", (byte) 27);
        setByteField(term295914, term295914.getClass(), "second", (byte) 51);
        setIntField(term295914, term295914.getClass(), "nano", 647763049);
        setField(term295909, term295909.getClass(), "time", term295914);
        setField(term295750, term295750.getClass(), "firstPlayDate", term295909);
        setField(term295750, term295750.getClass(), "lastGameId", "eWaksCBVal");
        setField(term295750, term295750.getClass(), "lastRomVersion", "EoJdXAfClg");
        setField(term295750, term295750.getClass(), "lastDataVersion", "WazOABAwle");
        setIntField(term295956, term295956.getClass(), "year", 2017);
        setShortField(term295956, term295956.getClass(), "month", (short) 5);
        setShortField(term295956, term295956.getClass(), "day", (short) 1);
        setField(term295955, term295955.getClass(), "date", term295956);
        setByteField(term295960, term295960.getClass(), "hour", (byte) 13);
        setByteField(term295960, term295960.getClass(), "minute", (byte) 47);
        setByteField(term295960, term295960.getClass(), "second", (byte) 35);
        setIntField(term295960, term295960.getClass(), "nano", 639444261);
        setField(term295955, term295955.getClass(), "time", term295960);
        setField(term295750, term295750.getClass(), "lastPlayDate", term295955);
        setIntField(term295750, term295750.getClass(), "lastPlaceId", -1193541067);
        setField(term295750, term295750.getClass(), "lastPlaceName", "OQYRpobHXe");
        setField(term295750, term295750.getClass(), "lastRegionId", "jcUOVEvSEy");
        setField(term295750, term295750.getClass(), "lastRegionName", "RvzDiamKiS");
        setField(term295750, term295750.getClass(), "lastAllNetId", "hFfCZPaDUh");
        setField(term295750, term295750.getClass(), "lastClientId", "sroouWPwJV");
        setField(term295748, term295748.getClass(), "user", term295750);
        setIntField(term295748, term295748.getClass(), "kind", 1034000306);
        setIntField(term295748, term295748.getClass(), "activityId", 408585174);
        setIntField(term295748, term295748.getClass(), "sortNumber", -408891900);
        setIntField(term295748, term295748.getClass(), "param1", 1130254738);
        setIntField(term295748, term295748.getClass(), "param2", 1350953168);
        setIntField(term295748, term295748.getClass(), "param3", -1493610451);
        setIntField(term295748, term295748.getClass(), "param4", -2139568336);
        term296033 = new Long(-2452492363070783282L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term296033;
        callMethod(klass, "setId", argTypes, term295748, args);
    }

};


