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

public class UserDetail_setTotalReMasterAchievement_667561686309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294454;
     Object term294509;

    public UserDetail_setTotalReMasterAchievement_667561686309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294454 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294454, term294454.getClass(), "id", 0L);
        setField(term294454, term294454.getClass(), "card", null);
        setField(term294454, term294454.getClass(), "userName", null);
        setIntField(term294454, term294454.getClass(), "isNetMember", 0);
        setIntField(term294454, term294454.getClass(), "iconId", 0);
        setIntField(term294454, term294454.getClass(), "plateId", 0);
        setIntField(term294454, term294454.getClass(), "titleId", 0);
        setIntField(term294454, term294454.getClass(), "partnerId", 0);
        setIntField(term294454, term294454.getClass(), "frameId", 0);
        setIntField(term294454, term294454.getClass(), "selectMapId", 0);
        setIntField(term294454, term294454.getClass(), "totalAwake", 0);
        setIntField(term294454, term294454.getClass(), "gradeRating", 0);
        setIntField(term294454, term294454.getClass(), "musicRating", 0);
        setIntField(term294454, term294454.getClass(), "playerRating", 0);
        setIntField(term294454, term294454.getClass(), "highestRating", 0);
        setIntField(term294454, term294454.getClass(), "gradeRank", 0);
        setIntField(term294454, term294454.getClass(), "classRank", 0);
        setIntField(term294454, term294454.getClass(), "courseRank", 0);
        setField(term294454, term294454.getClass(), "charaSlot", null);
        setField(term294454, term294454.getClass(), "charaLockSlot", null);
        setLongField(term294454, term294454.getClass(), "contentBit", 0L);
        setIntField(term294454, term294454.getClass(), "playCount", 0);
        setField(term294454, term294454.getClass(), "eventWatchedDate", null);
        setField(term294454, term294454.getClass(), "lastGameId", null);
        setField(term294454, term294454.getClass(), "lastRomVersion", null);
        setField(term294454, term294454.getClass(), "lastDataVersion", null);
        setField(term294454, term294454.getClass(), "lastLoginDate", null);
        setField(term294454, term294454.getClass(), "lastPlayDate", null);
        setIntField(term294454, term294454.getClass(), "lastPlayCredit", 0);
        setIntField(term294454, term294454.getClass(), "lastPlayMode", 0);
        setIntField(term294454, term294454.getClass(), "lastPlaceId", 0);
        setField(term294454, term294454.getClass(), "lastPlaceName", null);
        setIntField(term294454, term294454.getClass(), "lastAllNetId", 0);
        setIntField(term294454, term294454.getClass(), "lastRegionId", 0);
        setField(term294454, term294454.getClass(), "lastRegionName", null);
        setField(term294454, term294454.getClass(), "lastClientId", null);
        setField(term294454, term294454.getClass(), "lastCountryCode", null);
        setIntField(term294454, term294454.getClass(), "lastSelectEMoney", 0);
        setIntField(term294454, term294454.getClass(), "lastSelectTicket", 0);
        setIntField(term294454, term294454.getClass(), "lastSelectCourse", 0);
        setIntField(term294454, term294454.getClass(), "lastCountCourse", 0);
        setField(term294454, term294454.getClass(), "firstGameId", null);
        setField(term294454, term294454.getClass(), "firstRomVersion", null);
        setField(term294454, term294454.getClass(), "firstDataVersion", null);
        setField(term294454, term294454.getClass(), "firstPlayDate", null);
        setField(term294454, term294454.getClass(), "compatibleCmVersion", null);
        setField(term294454, term294454.getClass(), "dailyBonusDate", null);
        setField(term294454, term294454.getClass(), "dailyCourseBonusDate", null);
        setField(term294454, term294454.getClass(), "lastPairLoginDate", null);
        setField(term294454, term294454.getClass(), "lastTrialPlayDate", null);
        setIntField(term294454, term294454.getClass(), "playVsCount", 0);
        setIntField(term294454, term294454.getClass(), "playSyncCount", 0);
        setIntField(term294454, term294454.getClass(), "winCount", 0);
        setIntField(term294454, term294454.getClass(), "helpCount", 0);
        setIntField(term294454, term294454.getClass(), "comboCount", 0);
        setLongField(term294454, term294454.getClass(), "totalDeluxscore", 0L);
        setLongField(term294454, term294454.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294454, term294454.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294454, term294454.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294454, term294454.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294454, term294454.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294454, term294454.getClass(), "totalSync", 0);
        setIntField(term294454, term294454.getClass(), "totalBasicSync", 0);
        setIntField(term294454, term294454.getClass(), "totalAdvancedSync", 0);
        setIntField(term294454, term294454.getClass(), "totalExpertSync", 0);
        setIntField(term294454, term294454.getClass(), "totalMasterSync", 0);
        setIntField(term294454, term294454.getClass(), "totalReMasterSync", 0);
        setLongField(term294454, term294454.getClass(), "totalAchievement", 0L);
        setLongField(term294454, term294454.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294454, term294454.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294454, term294454.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294454, term294454.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294454, term294454.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294454, term294454.getClass(), "playerOldRating", 0L);
        setLongField(term294454, term294454.getClass(), "playerNewRating", 0L);
        setIntField(term294454, term294454.getClass(), "banState", 0);
        setLongField(term294454, term294454.getClass(), "dateTime", 0L);
        term294509 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term294509;
        callMethod(klass, "setTotalReMasterAchievement", argTypes, term294454, args);
    }

};


