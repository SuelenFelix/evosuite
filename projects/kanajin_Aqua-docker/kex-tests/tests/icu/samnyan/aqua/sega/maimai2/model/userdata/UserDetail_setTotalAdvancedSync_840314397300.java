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
import java.lang.Integer;

public class UserDetail_setTotalAdvancedSync_840314397300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293941;
     Object term293996;

    public UserDetail_setTotalAdvancedSync_840314397300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293941 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293941, term293941.getClass(), "id", 0L);
        setField(term293941, term293941.getClass(), "card", null);
        setField(term293941, term293941.getClass(), "userName", null);
        setIntField(term293941, term293941.getClass(), "isNetMember", 0);
        setIntField(term293941, term293941.getClass(), "iconId", 0);
        setIntField(term293941, term293941.getClass(), "plateId", 0);
        setIntField(term293941, term293941.getClass(), "titleId", 0);
        setIntField(term293941, term293941.getClass(), "partnerId", 0);
        setIntField(term293941, term293941.getClass(), "frameId", 0);
        setIntField(term293941, term293941.getClass(), "selectMapId", 0);
        setIntField(term293941, term293941.getClass(), "totalAwake", 0);
        setIntField(term293941, term293941.getClass(), "gradeRating", 0);
        setIntField(term293941, term293941.getClass(), "musicRating", 0);
        setIntField(term293941, term293941.getClass(), "playerRating", 0);
        setIntField(term293941, term293941.getClass(), "highestRating", 0);
        setIntField(term293941, term293941.getClass(), "gradeRank", 0);
        setIntField(term293941, term293941.getClass(), "classRank", 0);
        setIntField(term293941, term293941.getClass(), "courseRank", 0);
        setField(term293941, term293941.getClass(), "charaSlot", null);
        setField(term293941, term293941.getClass(), "charaLockSlot", null);
        setLongField(term293941, term293941.getClass(), "contentBit", 0L);
        setIntField(term293941, term293941.getClass(), "playCount", 0);
        setField(term293941, term293941.getClass(), "eventWatchedDate", null);
        setField(term293941, term293941.getClass(), "lastGameId", null);
        setField(term293941, term293941.getClass(), "lastRomVersion", null);
        setField(term293941, term293941.getClass(), "lastDataVersion", null);
        setField(term293941, term293941.getClass(), "lastLoginDate", null);
        setField(term293941, term293941.getClass(), "lastPlayDate", null);
        setIntField(term293941, term293941.getClass(), "lastPlayCredit", 0);
        setIntField(term293941, term293941.getClass(), "lastPlayMode", 0);
        setIntField(term293941, term293941.getClass(), "lastPlaceId", 0);
        setField(term293941, term293941.getClass(), "lastPlaceName", null);
        setIntField(term293941, term293941.getClass(), "lastAllNetId", 0);
        setIntField(term293941, term293941.getClass(), "lastRegionId", 0);
        setField(term293941, term293941.getClass(), "lastRegionName", null);
        setField(term293941, term293941.getClass(), "lastClientId", null);
        setField(term293941, term293941.getClass(), "lastCountryCode", null);
        setIntField(term293941, term293941.getClass(), "lastSelectEMoney", 0);
        setIntField(term293941, term293941.getClass(), "lastSelectTicket", 0);
        setIntField(term293941, term293941.getClass(), "lastSelectCourse", 0);
        setIntField(term293941, term293941.getClass(), "lastCountCourse", 0);
        setField(term293941, term293941.getClass(), "firstGameId", null);
        setField(term293941, term293941.getClass(), "firstRomVersion", null);
        setField(term293941, term293941.getClass(), "firstDataVersion", null);
        setField(term293941, term293941.getClass(), "firstPlayDate", null);
        setField(term293941, term293941.getClass(), "compatibleCmVersion", null);
        setField(term293941, term293941.getClass(), "dailyBonusDate", null);
        setField(term293941, term293941.getClass(), "dailyCourseBonusDate", null);
        setField(term293941, term293941.getClass(), "lastPairLoginDate", null);
        setField(term293941, term293941.getClass(), "lastTrialPlayDate", null);
        setIntField(term293941, term293941.getClass(), "playVsCount", 0);
        setIntField(term293941, term293941.getClass(), "playSyncCount", 0);
        setIntField(term293941, term293941.getClass(), "winCount", 0);
        setIntField(term293941, term293941.getClass(), "helpCount", 0);
        setIntField(term293941, term293941.getClass(), "comboCount", 0);
        setLongField(term293941, term293941.getClass(), "totalDeluxscore", 0L);
        setLongField(term293941, term293941.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293941, term293941.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293941, term293941.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293941, term293941.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293941, term293941.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293941, term293941.getClass(), "totalSync", 0);
        setIntField(term293941, term293941.getClass(), "totalBasicSync", 0);
        setIntField(term293941, term293941.getClass(), "totalAdvancedSync", 0);
        setIntField(term293941, term293941.getClass(), "totalExpertSync", 0);
        setIntField(term293941, term293941.getClass(), "totalMasterSync", 0);
        setIntField(term293941, term293941.getClass(), "totalReMasterSync", 0);
        setLongField(term293941, term293941.getClass(), "totalAchievement", 0L);
        setLongField(term293941, term293941.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293941, term293941.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293941, term293941.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293941, term293941.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293941, term293941.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293941, term293941.getClass(), "playerOldRating", 0L);
        setLongField(term293941, term293941.getClass(), "playerNewRating", 0L);
        setIntField(term293941, term293941.getClass(), "banState", 0);
        setLongField(term293941, term293941.getClass(), "dateTime", 0L);
        term293996 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293996;
        callMethod(klass, "setTotalAdvancedSync", argTypes, term293941, args);
    }

};


