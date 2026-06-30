package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserItem_setItemKind_16426448978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86708;
     Object term86887;

    public UserItem_setItemKind_16426448978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term86714 = new Long(-2951854704066477061L);
        term86708 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term86710 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term86712 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term86728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86733 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86743 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term86708, term86708.getClass(), "id", 3550928874058758597L);
        setLongField(term86710, term86710.getClass(), "id", 987797117310260031L);
        setLongField(term86712, term86712.getClass(), "id", -4703513086610650698L);
        setField(term86712, term86712.getClass(), "extId", term86714);
        setField(term86712, term86712.getClass(), "luid", "ODhSWAnZWd");
        setIntField(term86729, term86729.getClass(), "year", 2014);
        setShortField(term86729, term86729.getClass(), "month", (short) 11);
        setShortField(term86729, term86729.getClass(), "day", (short) 16);
        setField(term86728, term86728.getClass(), "date", term86729);
        setByteField(term86733, term86733.getClass(), "hour", (byte) 22);
        setByteField(term86733, term86733.getClass(), "minute", (byte) 31);
        setByteField(term86733, term86733.getClass(), "second", (byte) 12);
        setIntField(term86733, term86733.getClass(), "nano", 196022579);
        setField(term86728, term86728.getClass(), "time", term86733);
        setField(term86712, term86712.getClass(), "registerTime", term86728);
        setIntField(term86739, term86739.getClass(), "year", 2020);
        setShortField(term86739, term86739.getClass(), "month", (short) 4);
        setShortField(term86739, term86739.getClass(), "day", (short) 19);
        setField(term86738, term86738.getClass(), "date", term86739);
        setByteField(term86743, term86743.getClass(), "hour", (byte) 5);
        setByteField(term86743, term86743.getClass(), "minute", (byte) 30);
        setByteField(term86743, term86743.getClass(), "second", (byte) 22);
        setIntField(term86743, term86743.getClass(), "nano", 839145960);
        setField(term86738, term86738.getClass(), "time", term86743);
        setField(term86712, term86712.getClass(), "accessTime", term86738);
        setField(term86710, term86710.getClass(), "card", term86712);
        setIntField(term86710, term86710.getClass(), "lastDataVersion", 1147575851);
        setField(term86710, term86710.getClass(), "userName", "NQkFXmkuYK");
        setIntField(term86710, term86710.getClass(), "point", -1444871975);
        setIntField(term86710, term86710.getClass(), "totalPoint", 16937693);
        setIntField(term86710, term86710.getClass(), "iconId", 449328397);
        setIntField(term86710, term86710.getClass(), "nameplateId", 2141163970);
        setIntField(term86710, term86710.getClass(), "frameId", -1171001349);
        setIntField(term86710, term86710.getClass(), "trophyId", -171268418);
        setIntField(term86710, term86710.getClass(), "playCount", -512014955);
        setIntField(term86710, term86710.getClass(), "playVsCount", 727682522);
        setIntField(term86710, term86710.getClass(), "playSyncCount", -948539005);
        setIntField(term86710, term86710.getClass(), "winCount", -109851814);
        setIntField(term86710, term86710.getClass(), "helpCount", -1512846192);
        setIntField(term86710, term86710.getClass(), "comboCount", 1915662147);
        setIntField(term86710, term86710.getClass(), "feverCount", 1574061857);
        setIntField(term86710, term86710.getClass(), "totalHiScore", 1496265790);
        setIntField(term86710, term86710.getClass(), "totalEasyHighScore", -1548575078);
        setIntField(term86710, term86710.getClass(), "totalBasicHighScore", 80031735);
        setIntField(term86710, term86710.getClass(), "totalAdvancedHighScore", -1471664971);
        setIntField(term86710, term86710.getClass(), "totalExpertHighScore", -1016726676);
        setIntField(term86710, term86710.getClass(), "totalMasterHighScore", 375593728);
        setIntField(term86710, term86710.getClass(), "totalReMasterHighScore", -1684773948);
        setIntField(term86710, term86710.getClass(), "totalHighSync", -902905305);
        setIntField(term86710, term86710.getClass(), "totalEasySync", -800651098);
        setIntField(term86710, term86710.getClass(), "totalBasicSync", -1572119625);
        setIntField(term86710, term86710.getClass(), "totalAdvancedSync", 248535854);
        setIntField(term86710, term86710.getClass(), "totalExpertSync", -1512718729);
        setIntField(term86710, term86710.getClass(), "totalMasterSync", -1550333717);
        setIntField(term86710, term86710.getClass(), "totalReMasterSync", 1700458639);
        setIntField(term86710, term86710.getClass(), "playerRating", 2109100178);
        setIntField(term86710, term86710.getClass(), "highestRating", -1329545198);
        setIntField(term86710, term86710.getClass(), "rankAuthTailId", 106584642);
        setField(term86710, term86710.getClass(), "eventWatchedDate", "kHzsJWDHsz");
        setField(term86710, term86710.getClass(), "webLimitDate", "jIfbtgnHqt");
        setIntField(term86710, term86710.getClass(), "challengeTrackPhase", 2127403432);
        setIntField(term86710, term86710.getClass(), "firstPlayBits", -1964358770);
        setField(term86710, term86710.getClass(), "lastPlayDate", "vNvzjymLXH");
        setIntField(term86710, term86710.getClass(), "lastPlaceId", -1186050457);
        setField(term86710, term86710.getClass(), "lastPlaceName", "TCadyfXzAm");
        setIntField(term86710, term86710.getClass(), "lastRegionId", 1724133301);
        setField(term86710, term86710.getClass(), "lastRegionName", "rSSEpZFUMc");
        setField(term86710, term86710.getClass(), "lastClientId", "DJHwHjvNlc");
        setField(term86710, term86710.getClass(), "lastCountryCode", "ZSBzHqaLtQ");
        setIntField(term86710, term86710.getClass(), "eventPoint", 1312470308);
        setIntField(term86710, term86710.getClass(), "totalLv", 1284007584);
        setIntField(term86710, term86710.getClass(), "lastLoginBonusDay", 299163834);
        setIntField(term86710, term86710.getClass(), "lastSurvivalBonusDay", 1798074784);
        setIntField(term86710, term86710.getClass(), "loginBonusLv", -465480674);
        setField(term86708, term86708.getClass(), "user", term86710);
        setIntField(term86708, term86708.getClass(), "itemKind", -919780595);
        setIntField(term86708, term86708.getClass(), "itemId", -343343560);
        setIntField(term86708, term86708.getClass(), "stock", 1363779115);
        term86887 = new Integer(1605118681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term86887;
        callMethod(klass, "setItemKind", argTypes, term86708, args);
    }

};


