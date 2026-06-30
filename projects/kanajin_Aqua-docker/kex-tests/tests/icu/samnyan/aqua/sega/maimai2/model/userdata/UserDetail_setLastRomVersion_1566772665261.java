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

public class UserDetail_setLastRomVersion_1566772665261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291752;

    public UserDetail_setLastRomVersion_1566772665261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291752 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291752, term291752.getClass(), "id", 0L);
        setField(term291752, term291752.getClass(), "card", null);
        setField(term291752, term291752.getClass(), "userName", null);
        setIntField(term291752, term291752.getClass(), "isNetMember", 0);
        setIntField(term291752, term291752.getClass(), "iconId", 0);
        setIntField(term291752, term291752.getClass(), "plateId", 0);
        setIntField(term291752, term291752.getClass(), "titleId", 0);
        setIntField(term291752, term291752.getClass(), "partnerId", 0);
        setIntField(term291752, term291752.getClass(), "frameId", 0);
        setIntField(term291752, term291752.getClass(), "selectMapId", 0);
        setIntField(term291752, term291752.getClass(), "totalAwake", 0);
        setIntField(term291752, term291752.getClass(), "gradeRating", 0);
        setIntField(term291752, term291752.getClass(), "musicRating", 0);
        setIntField(term291752, term291752.getClass(), "playerRating", 0);
        setIntField(term291752, term291752.getClass(), "highestRating", 0);
        setIntField(term291752, term291752.getClass(), "gradeRank", 0);
        setIntField(term291752, term291752.getClass(), "classRank", 0);
        setIntField(term291752, term291752.getClass(), "courseRank", 0);
        setField(term291752, term291752.getClass(), "charaSlot", null);
        setField(term291752, term291752.getClass(), "charaLockSlot", null);
        setLongField(term291752, term291752.getClass(), "contentBit", 0L);
        setIntField(term291752, term291752.getClass(), "playCount", 0);
        setField(term291752, term291752.getClass(), "eventWatchedDate", null);
        setField(term291752, term291752.getClass(), "lastGameId", null);
        setField(term291752, term291752.getClass(), "lastRomVersion", null);
        setField(term291752, term291752.getClass(), "lastDataVersion", null);
        setField(term291752, term291752.getClass(), "lastLoginDate", null);
        setField(term291752, term291752.getClass(), "lastPlayDate", null);
        setIntField(term291752, term291752.getClass(), "lastPlayCredit", 0);
        setIntField(term291752, term291752.getClass(), "lastPlayMode", 0);
        setIntField(term291752, term291752.getClass(), "lastPlaceId", 0);
        setField(term291752, term291752.getClass(), "lastPlaceName", null);
        setIntField(term291752, term291752.getClass(), "lastAllNetId", 0);
        setIntField(term291752, term291752.getClass(), "lastRegionId", 0);
        setField(term291752, term291752.getClass(), "lastRegionName", null);
        setField(term291752, term291752.getClass(), "lastClientId", null);
        setField(term291752, term291752.getClass(), "lastCountryCode", null);
        setIntField(term291752, term291752.getClass(), "lastSelectEMoney", 0);
        setIntField(term291752, term291752.getClass(), "lastSelectTicket", 0);
        setIntField(term291752, term291752.getClass(), "lastSelectCourse", 0);
        setIntField(term291752, term291752.getClass(), "lastCountCourse", 0);
        setField(term291752, term291752.getClass(), "firstGameId", null);
        setField(term291752, term291752.getClass(), "firstRomVersion", null);
        setField(term291752, term291752.getClass(), "firstDataVersion", null);
        setField(term291752, term291752.getClass(), "firstPlayDate", null);
        setField(term291752, term291752.getClass(), "compatibleCmVersion", null);
        setField(term291752, term291752.getClass(), "dailyBonusDate", null);
        setField(term291752, term291752.getClass(), "dailyCourseBonusDate", null);
        setField(term291752, term291752.getClass(), "lastPairLoginDate", null);
        setField(term291752, term291752.getClass(), "lastTrialPlayDate", null);
        setIntField(term291752, term291752.getClass(), "playVsCount", 0);
        setIntField(term291752, term291752.getClass(), "playSyncCount", 0);
        setIntField(term291752, term291752.getClass(), "winCount", 0);
        setIntField(term291752, term291752.getClass(), "helpCount", 0);
        setIntField(term291752, term291752.getClass(), "comboCount", 0);
        setLongField(term291752, term291752.getClass(), "totalDeluxscore", 0L);
        setLongField(term291752, term291752.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291752, term291752.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291752, term291752.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291752, term291752.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291752, term291752.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291752, term291752.getClass(), "totalSync", 0);
        setIntField(term291752, term291752.getClass(), "totalBasicSync", 0);
        setIntField(term291752, term291752.getClass(), "totalAdvancedSync", 0);
        setIntField(term291752, term291752.getClass(), "totalExpertSync", 0);
        setIntField(term291752, term291752.getClass(), "totalMasterSync", 0);
        setIntField(term291752, term291752.getClass(), "totalReMasterSync", 0);
        setLongField(term291752, term291752.getClass(), "totalAchievement", 0L);
        setLongField(term291752, term291752.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291752, term291752.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291752, term291752.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291752, term291752.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291752, term291752.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291752, term291752.getClass(), "playerOldRating", 0L);
        setLongField(term291752, term291752.getClass(), "playerNewRating", 0L);
        setIntField(term291752, term291752.getClass(), "banState", 0);
        setLongField(term291752, term291752.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRomVersion", argTypes, term291752, args);
    }

};


