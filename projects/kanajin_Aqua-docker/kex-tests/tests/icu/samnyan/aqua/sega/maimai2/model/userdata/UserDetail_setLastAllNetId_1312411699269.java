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

public class UserDetail_setLastAllNetId_1312411699269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292198;
     Object term292253;

    public UserDetail_setLastAllNetId_1312411699269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292198 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292198, term292198.getClass(), "id", 0L);
        setField(term292198, term292198.getClass(), "card", null);
        setField(term292198, term292198.getClass(), "userName", null);
        setIntField(term292198, term292198.getClass(), "isNetMember", 0);
        setIntField(term292198, term292198.getClass(), "iconId", 0);
        setIntField(term292198, term292198.getClass(), "plateId", 0);
        setIntField(term292198, term292198.getClass(), "titleId", 0);
        setIntField(term292198, term292198.getClass(), "partnerId", 0);
        setIntField(term292198, term292198.getClass(), "frameId", 0);
        setIntField(term292198, term292198.getClass(), "selectMapId", 0);
        setIntField(term292198, term292198.getClass(), "totalAwake", 0);
        setIntField(term292198, term292198.getClass(), "gradeRating", 0);
        setIntField(term292198, term292198.getClass(), "musicRating", 0);
        setIntField(term292198, term292198.getClass(), "playerRating", 0);
        setIntField(term292198, term292198.getClass(), "highestRating", 0);
        setIntField(term292198, term292198.getClass(), "gradeRank", 0);
        setIntField(term292198, term292198.getClass(), "classRank", 0);
        setIntField(term292198, term292198.getClass(), "courseRank", 0);
        setField(term292198, term292198.getClass(), "charaSlot", null);
        setField(term292198, term292198.getClass(), "charaLockSlot", null);
        setLongField(term292198, term292198.getClass(), "contentBit", 0L);
        setIntField(term292198, term292198.getClass(), "playCount", 0);
        setField(term292198, term292198.getClass(), "eventWatchedDate", null);
        setField(term292198, term292198.getClass(), "lastGameId", null);
        setField(term292198, term292198.getClass(), "lastRomVersion", null);
        setField(term292198, term292198.getClass(), "lastDataVersion", null);
        setField(term292198, term292198.getClass(), "lastLoginDate", null);
        setField(term292198, term292198.getClass(), "lastPlayDate", null);
        setIntField(term292198, term292198.getClass(), "lastPlayCredit", 0);
        setIntField(term292198, term292198.getClass(), "lastPlayMode", 0);
        setIntField(term292198, term292198.getClass(), "lastPlaceId", 0);
        setField(term292198, term292198.getClass(), "lastPlaceName", null);
        setIntField(term292198, term292198.getClass(), "lastAllNetId", 0);
        setIntField(term292198, term292198.getClass(), "lastRegionId", 0);
        setField(term292198, term292198.getClass(), "lastRegionName", null);
        setField(term292198, term292198.getClass(), "lastClientId", null);
        setField(term292198, term292198.getClass(), "lastCountryCode", null);
        setIntField(term292198, term292198.getClass(), "lastSelectEMoney", 0);
        setIntField(term292198, term292198.getClass(), "lastSelectTicket", 0);
        setIntField(term292198, term292198.getClass(), "lastSelectCourse", 0);
        setIntField(term292198, term292198.getClass(), "lastCountCourse", 0);
        setField(term292198, term292198.getClass(), "firstGameId", null);
        setField(term292198, term292198.getClass(), "firstRomVersion", null);
        setField(term292198, term292198.getClass(), "firstDataVersion", null);
        setField(term292198, term292198.getClass(), "firstPlayDate", null);
        setField(term292198, term292198.getClass(), "compatibleCmVersion", null);
        setField(term292198, term292198.getClass(), "dailyBonusDate", null);
        setField(term292198, term292198.getClass(), "dailyCourseBonusDate", null);
        setField(term292198, term292198.getClass(), "lastPairLoginDate", null);
        setField(term292198, term292198.getClass(), "lastTrialPlayDate", null);
        setIntField(term292198, term292198.getClass(), "playVsCount", 0);
        setIntField(term292198, term292198.getClass(), "playSyncCount", 0);
        setIntField(term292198, term292198.getClass(), "winCount", 0);
        setIntField(term292198, term292198.getClass(), "helpCount", 0);
        setIntField(term292198, term292198.getClass(), "comboCount", 0);
        setLongField(term292198, term292198.getClass(), "totalDeluxscore", 0L);
        setLongField(term292198, term292198.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292198, term292198.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292198, term292198.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292198, term292198.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292198, term292198.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292198, term292198.getClass(), "totalSync", 0);
        setIntField(term292198, term292198.getClass(), "totalBasicSync", 0);
        setIntField(term292198, term292198.getClass(), "totalAdvancedSync", 0);
        setIntField(term292198, term292198.getClass(), "totalExpertSync", 0);
        setIntField(term292198, term292198.getClass(), "totalMasterSync", 0);
        setIntField(term292198, term292198.getClass(), "totalReMasterSync", 0);
        setLongField(term292198, term292198.getClass(), "totalAchievement", 0L);
        setLongField(term292198, term292198.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292198, term292198.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292198, term292198.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292198, term292198.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292198, term292198.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292198, term292198.getClass(), "playerOldRating", 0L);
        setLongField(term292198, term292198.getClass(), "playerNewRating", 0L);
        setIntField(term292198, term292198.getClass(), "banState", 0);
        setLongField(term292198, term292198.getClass(), "dateTime", 0L);
        term292253 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292253;
        callMethod(klass, "setLastAllNetId", argTypes, term292198, args);
    }

};


