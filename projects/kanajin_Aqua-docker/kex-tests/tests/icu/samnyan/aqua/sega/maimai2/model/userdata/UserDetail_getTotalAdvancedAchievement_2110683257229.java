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

public class UserDetail_getTotalAdvancedAchievement_2110683257229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289956;

    public UserDetail_getTotalAdvancedAchievement_2110683257229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289956 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289956, term289956.getClass(), "id", 0L);
        setField(term289956, term289956.getClass(), "card", null);
        setField(term289956, term289956.getClass(), "userName", null);
        setIntField(term289956, term289956.getClass(), "isNetMember", 0);
        setIntField(term289956, term289956.getClass(), "iconId", 0);
        setIntField(term289956, term289956.getClass(), "plateId", 0);
        setIntField(term289956, term289956.getClass(), "titleId", 0);
        setIntField(term289956, term289956.getClass(), "partnerId", 0);
        setIntField(term289956, term289956.getClass(), "frameId", 0);
        setIntField(term289956, term289956.getClass(), "selectMapId", 0);
        setIntField(term289956, term289956.getClass(), "totalAwake", 0);
        setIntField(term289956, term289956.getClass(), "gradeRating", 0);
        setIntField(term289956, term289956.getClass(), "musicRating", 0);
        setIntField(term289956, term289956.getClass(), "playerRating", 0);
        setIntField(term289956, term289956.getClass(), "highestRating", 0);
        setIntField(term289956, term289956.getClass(), "gradeRank", 0);
        setIntField(term289956, term289956.getClass(), "classRank", 0);
        setIntField(term289956, term289956.getClass(), "courseRank", 0);
        setField(term289956, term289956.getClass(), "charaSlot", null);
        setField(term289956, term289956.getClass(), "charaLockSlot", null);
        setLongField(term289956, term289956.getClass(), "contentBit", 0L);
        setIntField(term289956, term289956.getClass(), "playCount", 0);
        setField(term289956, term289956.getClass(), "eventWatchedDate", null);
        setField(term289956, term289956.getClass(), "lastGameId", null);
        setField(term289956, term289956.getClass(), "lastRomVersion", null);
        setField(term289956, term289956.getClass(), "lastDataVersion", null);
        setField(term289956, term289956.getClass(), "lastLoginDate", null);
        setField(term289956, term289956.getClass(), "lastPlayDate", null);
        setIntField(term289956, term289956.getClass(), "lastPlayCredit", 0);
        setIntField(term289956, term289956.getClass(), "lastPlayMode", 0);
        setIntField(term289956, term289956.getClass(), "lastPlaceId", 0);
        setField(term289956, term289956.getClass(), "lastPlaceName", null);
        setIntField(term289956, term289956.getClass(), "lastAllNetId", 0);
        setIntField(term289956, term289956.getClass(), "lastRegionId", 0);
        setField(term289956, term289956.getClass(), "lastRegionName", null);
        setField(term289956, term289956.getClass(), "lastClientId", null);
        setField(term289956, term289956.getClass(), "lastCountryCode", null);
        setIntField(term289956, term289956.getClass(), "lastSelectEMoney", 0);
        setIntField(term289956, term289956.getClass(), "lastSelectTicket", 0);
        setIntField(term289956, term289956.getClass(), "lastSelectCourse", 0);
        setIntField(term289956, term289956.getClass(), "lastCountCourse", 0);
        setField(term289956, term289956.getClass(), "firstGameId", null);
        setField(term289956, term289956.getClass(), "firstRomVersion", null);
        setField(term289956, term289956.getClass(), "firstDataVersion", null);
        setField(term289956, term289956.getClass(), "firstPlayDate", null);
        setField(term289956, term289956.getClass(), "compatibleCmVersion", null);
        setField(term289956, term289956.getClass(), "dailyBonusDate", null);
        setField(term289956, term289956.getClass(), "dailyCourseBonusDate", null);
        setField(term289956, term289956.getClass(), "lastPairLoginDate", null);
        setField(term289956, term289956.getClass(), "lastTrialPlayDate", null);
        setIntField(term289956, term289956.getClass(), "playVsCount", 0);
        setIntField(term289956, term289956.getClass(), "playSyncCount", 0);
        setIntField(term289956, term289956.getClass(), "winCount", 0);
        setIntField(term289956, term289956.getClass(), "helpCount", 0);
        setIntField(term289956, term289956.getClass(), "comboCount", 0);
        setLongField(term289956, term289956.getClass(), "totalDeluxscore", 0L);
        setLongField(term289956, term289956.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289956, term289956.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289956, term289956.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289956, term289956.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289956, term289956.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289956, term289956.getClass(), "totalSync", 0);
        setIntField(term289956, term289956.getClass(), "totalBasicSync", 0);
        setIntField(term289956, term289956.getClass(), "totalAdvancedSync", 0);
        setIntField(term289956, term289956.getClass(), "totalExpertSync", 0);
        setIntField(term289956, term289956.getClass(), "totalMasterSync", 0);
        setIntField(term289956, term289956.getClass(), "totalReMasterSync", 0);
        setLongField(term289956, term289956.getClass(), "totalAchievement", 0L);
        setLongField(term289956, term289956.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289956, term289956.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289956, term289956.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289956, term289956.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289956, term289956.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289956, term289956.getClass(), "playerOldRating", 0L);
        setLongField(term289956, term289956.getClass(), "playerNewRating", 0L);
        setIntField(term289956, term289956.getClass(), "banState", 0);
        setLongField(term289956, term289956.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedAchievement", argTypes, term289956, args);
    }

};


