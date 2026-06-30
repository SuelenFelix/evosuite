package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserDetail_setTotalReMasterDeluxscore_2137334951297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293770;
     Object term293825;

    public UserDetail_setTotalReMasterDeluxscore_2137334951297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293770 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293770, term293770.getClass(), "id", 0L);
        setField(term293770, term293770.getClass(), "card", null);
        setField(term293770, term293770.getClass(), "userName", null);
        setIntField(term293770, term293770.getClass(), "isNetMember", 0);
        setIntField(term293770, term293770.getClass(), "iconId", 0);
        setIntField(term293770, term293770.getClass(), "plateId", 0);
        setIntField(term293770, term293770.getClass(), "titleId", 0);
        setIntField(term293770, term293770.getClass(), "partnerId", 0);
        setIntField(term293770, term293770.getClass(), "frameId", 0);
        setIntField(term293770, term293770.getClass(), "selectMapId", 0);
        setIntField(term293770, term293770.getClass(), "totalAwake", 0);
        setIntField(term293770, term293770.getClass(), "gradeRating", 0);
        setIntField(term293770, term293770.getClass(), "musicRating", 0);
        setIntField(term293770, term293770.getClass(), "playerRating", 0);
        setIntField(term293770, term293770.getClass(), "highestRating", 0);
        setIntField(term293770, term293770.getClass(), "gradeRank", 0);
        setIntField(term293770, term293770.getClass(), "classRank", 0);
        setIntField(term293770, term293770.getClass(), "courseRank", 0);
        setField(term293770, term293770.getClass(), "charaSlot", null);
        setField(term293770, term293770.getClass(), "charaLockSlot", null);
        setLongField(term293770, term293770.getClass(), "contentBit", 0L);
        setIntField(term293770, term293770.getClass(), "playCount", 0);
        setField(term293770, term293770.getClass(), "eventWatchedDate", null);
        setField(term293770, term293770.getClass(), "lastGameId", null);
        setField(term293770, term293770.getClass(), "lastRomVersion", null);
        setField(term293770, term293770.getClass(), "lastDataVersion", null);
        setField(term293770, term293770.getClass(), "lastLoginDate", null);
        setField(term293770, term293770.getClass(), "lastPlayDate", null);
        setIntField(term293770, term293770.getClass(), "lastPlayCredit", 0);
        setIntField(term293770, term293770.getClass(), "lastPlayMode", 0);
        setIntField(term293770, term293770.getClass(), "lastPlaceId", 0);
        setField(term293770, term293770.getClass(), "lastPlaceName", null);
        setIntField(term293770, term293770.getClass(), "lastAllNetId", 0);
        setIntField(term293770, term293770.getClass(), "lastRegionId", 0);
        setField(term293770, term293770.getClass(), "lastRegionName", null);
        setField(term293770, term293770.getClass(), "lastClientId", null);
        setField(term293770, term293770.getClass(), "lastCountryCode", null);
        setIntField(term293770, term293770.getClass(), "lastSelectEMoney", 0);
        setIntField(term293770, term293770.getClass(), "lastSelectTicket", 0);
        setIntField(term293770, term293770.getClass(), "lastSelectCourse", 0);
        setIntField(term293770, term293770.getClass(), "lastCountCourse", 0);
        setField(term293770, term293770.getClass(), "firstGameId", null);
        setField(term293770, term293770.getClass(), "firstRomVersion", null);
        setField(term293770, term293770.getClass(), "firstDataVersion", null);
        setField(term293770, term293770.getClass(), "firstPlayDate", null);
        setField(term293770, term293770.getClass(), "compatibleCmVersion", null);
        setField(term293770, term293770.getClass(), "dailyBonusDate", null);
        setField(term293770, term293770.getClass(), "dailyCourseBonusDate", null);
        setField(term293770, term293770.getClass(), "lastPairLoginDate", null);
        setField(term293770, term293770.getClass(), "lastTrialPlayDate", null);
        setIntField(term293770, term293770.getClass(), "playVsCount", 0);
        setIntField(term293770, term293770.getClass(), "playSyncCount", 0);
        setIntField(term293770, term293770.getClass(), "winCount", 0);
        setIntField(term293770, term293770.getClass(), "helpCount", 0);
        setIntField(term293770, term293770.getClass(), "comboCount", 0);
        setLongField(term293770, term293770.getClass(), "totalDeluxscore", 0L);
        setLongField(term293770, term293770.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293770, term293770.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293770, term293770.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293770, term293770.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293770, term293770.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293770, term293770.getClass(), "totalSync", 0);
        setIntField(term293770, term293770.getClass(), "totalBasicSync", 0);
        setIntField(term293770, term293770.getClass(), "totalAdvancedSync", 0);
        setIntField(term293770, term293770.getClass(), "totalExpertSync", 0);
        setIntField(term293770, term293770.getClass(), "totalMasterSync", 0);
        setIntField(term293770, term293770.getClass(), "totalReMasterSync", 0);
        setLongField(term293770, term293770.getClass(), "totalAchievement", 0L);
        setLongField(term293770, term293770.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293770, term293770.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293770, term293770.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293770, term293770.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293770, term293770.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293770, term293770.getClass(), "playerOldRating", 0L);
        setLongField(term293770, term293770.getClass(), "playerNewRating", 0L);
        setIntField(term293770, term293770.getClass(), "banState", 0);
        setLongField(term293770, term293770.getClass(), "dateTime", 0L);
        term293825 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term293825;
        callMethod(klass, "setTotalReMasterDeluxscore", argTypes, term293770, args);
    }

};


