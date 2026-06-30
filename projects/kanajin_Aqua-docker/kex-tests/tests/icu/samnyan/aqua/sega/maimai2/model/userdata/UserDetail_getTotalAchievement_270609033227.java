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

public class UserDetail_getTotalAchievement_270609033227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289846;

    public UserDetail_getTotalAchievement_270609033227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289846 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289846, term289846.getClass(), "id", 0L);
        setField(term289846, term289846.getClass(), "card", null);
        setField(term289846, term289846.getClass(), "userName", null);
        setIntField(term289846, term289846.getClass(), "isNetMember", 0);
        setIntField(term289846, term289846.getClass(), "iconId", 0);
        setIntField(term289846, term289846.getClass(), "plateId", 0);
        setIntField(term289846, term289846.getClass(), "titleId", 0);
        setIntField(term289846, term289846.getClass(), "partnerId", 0);
        setIntField(term289846, term289846.getClass(), "frameId", 0);
        setIntField(term289846, term289846.getClass(), "selectMapId", 0);
        setIntField(term289846, term289846.getClass(), "totalAwake", 0);
        setIntField(term289846, term289846.getClass(), "gradeRating", 0);
        setIntField(term289846, term289846.getClass(), "musicRating", 0);
        setIntField(term289846, term289846.getClass(), "playerRating", 0);
        setIntField(term289846, term289846.getClass(), "highestRating", 0);
        setIntField(term289846, term289846.getClass(), "gradeRank", 0);
        setIntField(term289846, term289846.getClass(), "classRank", 0);
        setIntField(term289846, term289846.getClass(), "courseRank", 0);
        setField(term289846, term289846.getClass(), "charaSlot", null);
        setField(term289846, term289846.getClass(), "charaLockSlot", null);
        setLongField(term289846, term289846.getClass(), "contentBit", 0L);
        setIntField(term289846, term289846.getClass(), "playCount", 0);
        setField(term289846, term289846.getClass(), "eventWatchedDate", null);
        setField(term289846, term289846.getClass(), "lastGameId", null);
        setField(term289846, term289846.getClass(), "lastRomVersion", null);
        setField(term289846, term289846.getClass(), "lastDataVersion", null);
        setField(term289846, term289846.getClass(), "lastLoginDate", null);
        setField(term289846, term289846.getClass(), "lastPlayDate", null);
        setIntField(term289846, term289846.getClass(), "lastPlayCredit", 0);
        setIntField(term289846, term289846.getClass(), "lastPlayMode", 0);
        setIntField(term289846, term289846.getClass(), "lastPlaceId", 0);
        setField(term289846, term289846.getClass(), "lastPlaceName", null);
        setIntField(term289846, term289846.getClass(), "lastAllNetId", 0);
        setIntField(term289846, term289846.getClass(), "lastRegionId", 0);
        setField(term289846, term289846.getClass(), "lastRegionName", null);
        setField(term289846, term289846.getClass(), "lastClientId", null);
        setField(term289846, term289846.getClass(), "lastCountryCode", null);
        setIntField(term289846, term289846.getClass(), "lastSelectEMoney", 0);
        setIntField(term289846, term289846.getClass(), "lastSelectTicket", 0);
        setIntField(term289846, term289846.getClass(), "lastSelectCourse", 0);
        setIntField(term289846, term289846.getClass(), "lastCountCourse", 0);
        setField(term289846, term289846.getClass(), "firstGameId", null);
        setField(term289846, term289846.getClass(), "firstRomVersion", null);
        setField(term289846, term289846.getClass(), "firstDataVersion", null);
        setField(term289846, term289846.getClass(), "firstPlayDate", null);
        setField(term289846, term289846.getClass(), "compatibleCmVersion", null);
        setField(term289846, term289846.getClass(), "dailyBonusDate", null);
        setField(term289846, term289846.getClass(), "dailyCourseBonusDate", null);
        setField(term289846, term289846.getClass(), "lastPairLoginDate", null);
        setField(term289846, term289846.getClass(), "lastTrialPlayDate", null);
        setIntField(term289846, term289846.getClass(), "playVsCount", 0);
        setIntField(term289846, term289846.getClass(), "playSyncCount", 0);
        setIntField(term289846, term289846.getClass(), "winCount", 0);
        setIntField(term289846, term289846.getClass(), "helpCount", 0);
        setIntField(term289846, term289846.getClass(), "comboCount", 0);
        setLongField(term289846, term289846.getClass(), "totalDeluxscore", 0L);
        setLongField(term289846, term289846.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289846, term289846.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289846, term289846.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289846, term289846.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289846, term289846.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289846, term289846.getClass(), "totalSync", 0);
        setIntField(term289846, term289846.getClass(), "totalBasicSync", 0);
        setIntField(term289846, term289846.getClass(), "totalAdvancedSync", 0);
        setIntField(term289846, term289846.getClass(), "totalExpertSync", 0);
        setIntField(term289846, term289846.getClass(), "totalMasterSync", 0);
        setIntField(term289846, term289846.getClass(), "totalReMasterSync", 0);
        setLongField(term289846, term289846.getClass(), "totalAchievement", 0L);
        setLongField(term289846, term289846.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289846, term289846.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289846, term289846.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289846, term289846.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289846, term289846.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289846, term289846.getClass(), "playerOldRating", 0L);
        setLongField(term289846, term289846.getClass(), "playerNewRating", 0L);
        setIntField(term289846, term289846.getClass(), "banState", 0);
        setLongField(term289846, term289846.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAchievement", argTypes, term289846, args);
    }

};


