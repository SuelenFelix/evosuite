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

public class UserDetail_setTotalBasicAchievement_1104778305305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294226;
     Object term294281;

    public UserDetail_setTotalBasicAchievement_1104778305305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294226 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294226, term294226.getClass(), "id", 0L);
        setField(term294226, term294226.getClass(), "card", null);
        setField(term294226, term294226.getClass(), "userName", null);
        setIntField(term294226, term294226.getClass(), "isNetMember", 0);
        setIntField(term294226, term294226.getClass(), "iconId", 0);
        setIntField(term294226, term294226.getClass(), "plateId", 0);
        setIntField(term294226, term294226.getClass(), "titleId", 0);
        setIntField(term294226, term294226.getClass(), "partnerId", 0);
        setIntField(term294226, term294226.getClass(), "frameId", 0);
        setIntField(term294226, term294226.getClass(), "selectMapId", 0);
        setIntField(term294226, term294226.getClass(), "totalAwake", 0);
        setIntField(term294226, term294226.getClass(), "gradeRating", 0);
        setIntField(term294226, term294226.getClass(), "musicRating", 0);
        setIntField(term294226, term294226.getClass(), "playerRating", 0);
        setIntField(term294226, term294226.getClass(), "highestRating", 0);
        setIntField(term294226, term294226.getClass(), "gradeRank", 0);
        setIntField(term294226, term294226.getClass(), "classRank", 0);
        setIntField(term294226, term294226.getClass(), "courseRank", 0);
        setField(term294226, term294226.getClass(), "charaSlot", null);
        setField(term294226, term294226.getClass(), "charaLockSlot", null);
        setLongField(term294226, term294226.getClass(), "contentBit", 0L);
        setIntField(term294226, term294226.getClass(), "playCount", 0);
        setField(term294226, term294226.getClass(), "eventWatchedDate", null);
        setField(term294226, term294226.getClass(), "lastGameId", null);
        setField(term294226, term294226.getClass(), "lastRomVersion", null);
        setField(term294226, term294226.getClass(), "lastDataVersion", null);
        setField(term294226, term294226.getClass(), "lastLoginDate", null);
        setField(term294226, term294226.getClass(), "lastPlayDate", null);
        setIntField(term294226, term294226.getClass(), "lastPlayCredit", 0);
        setIntField(term294226, term294226.getClass(), "lastPlayMode", 0);
        setIntField(term294226, term294226.getClass(), "lastPlaceId", 0);
        setField(term294226, term294226.getClass(), "lastPlaceName", null);
        setIntField(term294226, term294226.getClass(), "lastAllNetId", 0);
        setIntField(term294226, term294226.getClass(), "lastRegionId", 0);
        setField(term294226, term294226.getClass(), "lastRegionName", null);
        setField(term294226, term294226.getClass(), "lastClientId", null);
        setField(term294226, term294226.getClass(), "lastCountryCode", null);
        setIntField(term294226, term294226.getClass(), "lastSelectEMoney", 0);
        setIntField(term294226, term294226.getClass(), "lastSelectTicket", 0);
        setIntField(term294226, term294226.getClass(), "lastSelectCourse", 0);
        setIntField(term294226, term294226.getClass(), "lastCountCourse", 0);
        setField(term294226, term294226.getClass(), "firstGameId", null);
        setField(term294226, term294226.getClass(), "firstRomVersion", null);
        setField(term294226, term294226.getClass(), "firstDataVersion", null);
        setField(term294226, term294226.getClass(), "firstPlayDate", null);
        setField(term294226, term294226.getClass(), "compatibleCmVersion", null);
        setField(term294226, term294226.getClass(), "dailyBonusDate", null);
        setField(term294226, term294226.getClass(), "dailyCourseBonusDate", null);
        setField(term294226, term294226.getClass(), "lastPairLoginDate", null);
        setField(term294226, term294226.getClass(), "lastTrialPlayDate", null);
        setIntField(term294226, term294226.getClass(), "playVsCount", 0);
        setIntField(term294226, term294226.getClass(), "playSyncCount", 0);
        setIntField(term294226, term294226.getClass(), "winCount", 0);
        setIntField(term294226, term294226.getClass(), "helpCount", 0);
        setIntField(term294226, term294226.getClass(), "comboCount", 0);
        setLongField(term294226, term294226.getClass(), "totalDeluxscore", 0L);
        setLongField(term294226, term294226.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294226, term294226.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294226, term294226.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294226, term294226.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294226, term294226.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294226, term294226.getClass(), "totalSync", 0);
        setIntField(term294226, term294226.getClass(), "totalBasicSync", 0);
        setIntField(term294226, term294226.getClass(), "totalAdvancedSync", 0);
        setIntField(term294226, term294226.getClass(), "totalExpertSync", 0);
        setIntField(term294226, term294226.getClass(), "totalMasterSync", 0);
        setIntField(term294226, term294226.getClass(), "totalReMasterSync", 0);
        setLongField(term294226, term294226.getClass(), "totalAchievement", 0L);
        setLongField(term294226, term294226.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294226, term294226.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294226, term294226.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294226, term294226.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294226, term294226.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294226, term294226.getClass(), "playerOldRating", 0L);
        setLongField(term294226, term294226.getClass(), "playerNewRating", 0L);
        setIntField(term294226, term294226.getClass(), "banState", 0);
        setLongField(term294226, term294226.getClass(), "dateTime", 0L);
        term294281 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term294281;
        callMethod(klass, "setTotalBasicAchievement", argTypes, term294226, args);
    }

};


