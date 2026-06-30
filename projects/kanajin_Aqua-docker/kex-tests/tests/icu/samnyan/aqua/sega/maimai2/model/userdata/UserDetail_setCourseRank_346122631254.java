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

public class UserDetail_setCourseRank_346122631254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291361;
     Object term291416;

    public UserDetail_setCourseRank_346122631254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291361 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291361, term291361.getClass(), "id", 0L);
        setField(term291361, term291361.getClass(), "card", null);
        setField(term291361, term291361.getClass(), "userName", null);
        setIntField(term291361, term291361.getClass(), "isNetMember", 0);
        setIntField(term291361, term291361.getClass(), "iconId", 0);
        setIntField(term291361, term291361.getClass(), "plateId", 0);
        setIntField(term291361, term291361.getClass(), "titleId", 0);
        setIntField(term291361, term291361.getClass(), "partnerId", 0);
        setIntField(term291361, term291361.getClass(), "frameId", 0);
        setIntField(term291361, term291361.getClass(), "selectMapId", 0);
        setIntField(term291361, term291361.getClass(), "totalAwake", 0);
        setIntField(term291361, term291361.getClass(), "gradeRating", 0);
        setIntField(term291361, term291361.getClass(), "musicRating", 0);
        setIntField(term291361, term291361.getClass(), "playerRating", 0);
        setIntField(term291361, term291361.getClass(), "highestRating", 0);
        setIntField(term291361, term291361.getClass(), "gradeRank", 0);
        setIntField(term291361, term291361.getClass(), "classRank", 0);
        setIntField(term291361, term291361.getClass(), "courseRank", 0);
        setField(term291361, term291361.getClass(), "charaSlot", null);
        setField(term291361, term291361.getClass(), "charaLockSlot", null);
        setLongField(term291361, term291361.getClass(), "contentBit", 0L);
        setIntField(term291361, term291361.getClass(), "playCount", 0);
        setField(term291361, term291361.getClass(), "eventWatchedDate", null);
        setField(term291361, term291361.getClass(), "lastGameId", null);
        setField(term291361, term291361.getClass(), "lastRomVersion", null);
        setField(term291361, term291361.getClass(), "lastDataVersion", null);
        setField(term291361, term291361.getClass(), "lastLoginDate", null);
        setField(term291361, term291361.getClass(), "lastPlayDate", null);
        setIntField(term291361, term291361.getClass(), "lastPlayCredit", 0);
        setIntField(term291361, term291361.getClass(), "lastPlayMode", 0);
        setIntField(term291361, term291361.getClass(), "lastPlaceId", 0);
        setField(term291361, term291361.getClass(), "lastPlaceName", null);
        setIntField(term291361, term291361.getClass(), "lastAllNetId", 0);
        setIntField(term291361, term291361.getClass(), "lastRegionId", 0);
        setField(term291361, term291361.getClass(), "lastRegionName", null);
        setField(term291361, term291361.getClass(), "lastClientId", null);
        setField(term291361, term291361.getClass(), "lastCountryCode", null);
        setIntField(term291361, term291361.getClass(), "lastSelectEMoney", 0);
        setIntField(term291361, term291361.getClass(), "lastSelectTicket", 0);
        setIntField(term291361, term291361.getClass(), "lastSelectCourse", 0);
        setIntField(term291361, term291361.getClass(), "lastCountCourse", 0);
        setField(term291361, term291361.getClass(), "firstGameId", null);
        setField(term291361, term291361.getClass(), "firstRomVersion", null);
        setField(term291361, term291361.getClass(), "firstDataVersion", null);
        setField(term291361, term291361.getClass(), "firstPlayDate", null);
        setField(term291361, term291361.getClass(), "compatibleCmVersion", null);
        setField(term291361, term291361.getClass(), "dailyBonusDate", null);
        setField(term291361, term291361.getClass(), "dailyCourseBonusDate", null);
        setField(term291361, term291361.getClass(), "lastPairLoginDate", null);
        setField(term291361, term291361.getClass(), "lastTrialPlayDate", null);
        setIntField(term291361, term291361.getClass(), "playVsCount", 0);
        setIntField(term291361, term291361.getClass(), "playSyncCount", 0);
        setIntField(term291361, term291361.getClass(), "winCount", 0);
        setIntField(term291361, term291361.getClass(), "helpCount", 0);
        setIntField(term291361, term291361.getClass(), "comboCount", 0);
        setLongField(term291361, term291361.getClass(), "totalDeluxscore", 0L);
        setLongField(term291361, term291361.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291361, term291361.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291361, term291361.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291361, term291361.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291361, term291361.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291361, term291361.getClass(), "totalSync", 0);
        setIntField(term291361, term291361.getClass(), "totalBasicSync", 0);
        setIntField(term291361, term291361.getClass(), "totalAdvancedSync", 0);
        setIntField(term291361, term291361.getClass(), "totalExpertSync", 0);
        setIntField(term291361, term291361.getClass(), "totalMasterSync", 0);
        setIntField(term291361, term291361.getClass(), "totalReMasterSync", 0);
        setLongField(term291361, term291361.getClass(), "totalAchievement", 0L);
        setLongField(term291361, term291361.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291361, term291361.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291361, term291361.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291361, term291361.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291361, term291361.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291361, term291361.getClass(), "playerOldRating", 0L);
        setLongField(term291361, term291361.getClass(), "playerNewRating", 0L);
        setIntField(term291361, term291361.getClass(), "banState", 0);
        setLongField(term291361, term291361.getClass(), "dateTime", 0L);
        term291416 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291416;
        callMethod(klass, "setCourseRank", argTypes, term291361, args);
    }

};


