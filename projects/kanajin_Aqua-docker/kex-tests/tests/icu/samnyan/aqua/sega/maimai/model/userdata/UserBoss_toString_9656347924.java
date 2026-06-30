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

public class UserBoss_toString_9656347924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95807;

    public UserBoss_toString_9656347924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term95813 = new Long(-5935517391653614345L);
        term95807 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term95809 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term95811 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term95827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95842 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term95807, term95807.getClass(), "id", 3410627884495049043L);
        setLongField(term95809, term95809.getClass(), "id", -1884609063652624817L);
        setLongField(term95811, term95811.getClass(), "id", 4110677574531044171L);
        setField(term95811, term95811.getClass(), "extId", term95813);
        setField(term95811, term95811.getClass(), "luid", "RreVzKmtxf");
        setIntField(term95828, term95828.getClass(), "year", 2017);
        setShortField(term95828, term95828.getClass(), "month", (short) 4);
        setShortField(term95828, term95828.getClass(), "day", (short) 16);
        setField(term95827, term95827.getClass(), "date", term95828);
        setByteField(term95832, term95832.getClass(), "hour", (byte) 8);
        setByteField(term95832, term95832.getClass(), "minute", (byte) 31);
        setByteField(term95832, term95832.getClass(), "second", (byte) 56);
        setIntField(term95832, term95832.getClass(), "nano", 663406344);
        setField(term95827, term95827.getClass(), "time", term95832);
        setField(term95811, term95811.getClass(), "registerTime", term95827);
        setIntField(term95838, term95838.getClass(), "year", 2010);
        setShortField(term95838, term95838.getClass(), "month", (short) 7);
        setShortField(term95838, term95838.getClass(), "day", (short) 8);
        setField(term95837, term95837.getClass(), "date", term95838);
        setByteField(term95842, term95842.getClass(), "hour", (byte) 3);
        setByteField(term95842, term95842.getClass(), "minute", (byte) 45);
        setByteField(term95842, term95842.getClass(), "second", (byte) 2);
        setIntField(term95842, term95842.getClass(), "nano", 15135741);
        setField(term95837, term95837.getClass(), "time", term95842);
        setField(term95811, term95811.getClass(), "accessTime", term95837);
        setField(term95809, term95809.getClass(), "card", term95811);
        setIntField(term95809, term95809.getClass(), "lastDataVersion", -178928635);
        setField(term95809, term95809.getClass(), "userName", "xHBCsghEAi");
        setIntField(term95809, term95809.getClass(), "point", -1900928314);
        setIntField(term95809, term95809.getClass(), "totalPoint", 1771936673);
        setIntField(term95809, term95809.getClass(), "iconId", 2143013182);
        setIntField(term95809, term95809.getClass(), "nameplateId", -1417724314);
        setIntField(term95809, term95809.getClass(), "frameId", 399632866);
        setIntField(term95809, term95809.getClass(), "trophyId", -2021554219);
        setIntField(term95809, term95809.getClass(), "playCount", -1413689781);
        setIntField(term95809, term95809.getClass(), "playVsCount", 815841458);
        setIntField(term95809, term95809.getClass(), "playSyncCount", 1868301095);
        setIntField(term95809, term95809.getClass(), "winCount", -194834401);
        setIntField(term95809, term95809.getClass(), "helpCount", 1718483259);
        setIntField(term95809, term95809.getClass(), "comboCount", 835852454);
        setIntField(term95809, term95809.getClass(), "feverCount", -1015606044);
        setIntField(term95809, term95809.getClass(), "totalHiScore", 772442148);
        setIntField(term95809, term95809.getClass(), "totalEasyHighScore", -801236347);
        setIntField(term95809, term95809.getClass(), "totalBasicHighScore", 1672056052);
        setIntField(term95809, term95809.getClass(), "totalAdvancedHighScore", -980627332);
        setIntField(term95809, term95809.getClass(), "totalExpertHighScore", 437346255);
        setIntField(term95809, term95809.getClass(), "totalMasterHighScore", 2053260189);
        setIntField(term95809, term95809.getClass(), "totalReMasterHighScore", -2053852874);
        setIntField(term95809, term95809.getClass(), "totalHighSync", -495359675);
        setIntField(term95809, term95809.getClass(), "totalEasySync", -384263579);
        setIntField(term95809, term95809.getClass(), "totalBasicSync", 846361208);
        setIntField(term95809, term95809.getClass(), "totalAdvancedSync", 1800799519);
        setIntField(term95809, term95809.getClass(), "totalExpertSync", 100734387);
        setIntField(term95809, term95809.getClass(), "totalMasterSync", 654779093);
        setIntField(term95809, term95809.getClass(), "totalReMasterSync", -2111377072);
        setIntField(term95809, term95809.getClass(), "playerRating", -983510285);
        setIntField(term95809, term95809.getClass(), "highestRating", 515505845);
        setIntField(term95809, term95809.getClass(), "rankAuthTailId", 2062061908);
        setField(term95809, term95809.getClass(), "eventWatchedDate", "BVlqqUSYbB");
        setField(term95809, term95809.getClass(), "webLimitDate", "hhGHcwcBqB");
        setIntField(term95809, term95809.getClass(), "challengeTrackPhase", 52784804);
        setIntField(term95809, term95809.getClass(), "firstPlayBits", -1368391368);
        setField(term95809, term95809.getClass(), "lastPlayDate", "WIVENkFxNU");
        setIntField(term95809, term95809.getClass(), "lastPlaceId", 1369129310);
        setField(term95809, term95809.getClass(), "lastPlaceName", "MFSosHURtm");
        setIntField(term95809, term95809.getClass(), "lastRegionId", -780519895);
        setField(term95809, term95809.getClass(), "lastRegionName", "hIBYlJpYye");
        setField(term95809, term95809.getClass(), "lastClientId", "LNendOzJhj");
        setField(term95809, term95809.getClass(), "lastCountryCode", "ZwcevQDgzv");
        setIntField(term95809, term95809.getClass(), "eventPoint", 137957762);
        setIntField(term95809, term95809.getClass(), "totalLv", -1051997267);
        setIntField(term95809, term95809.getClass(), "lastLoginBonusDay", -62396728);
        setIntField(term95809, term95809.getClass(), "lastSurvivalBonusDay", -268599867);
        setIntField(term95809, term95809.getClass(), "loginBonusLv", -1052701176);
        setField(term95807, term95807.getClass(), "user", term95809);
        setLongField(term95807, term95807.getClass(), "pandoraFlagList0", -7231877484121205165L);
        setLongField(term95807, term95807.getClass(), "pandoraFlagList1", 3571859690258686344L);
        setLongField(term95807, term95807.getClass(), "pandoraFlagList2", -3259323558419605103L);
        setLongField(term95807, term95807.getClass(), "pandoraFlagList3", 7299361469288644847L);
        setLongField(term95807, term95807.getClass(), "pandoraFlagList4", -5822755741902532021L);
        setLongField(term95807, term95807.getClass(), "pandoraFlagList5", 3092709067387780151L);
        setLongField(term95807, term95807.getClass(), "pandoraFlagList6", -5996777564331234572L);
        setLongField(term95807, term95807.getClass(), "emblemFlagList", -218745825074249415L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term95807, args);
    }

};


