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

public class UserDetail_setCharaLockSlot_1100366670256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291473;

    public UserDetail_setCharaLockSlot_1100366670256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291473 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291473, term291473.getClass(), "id", 0L);
        setField(term291473, term291473.getClass(), "card", null);
        setField(term291473, term291473.getClass(), "userName", null);
        setIntField(term291473, term291473.getClass(), "isNetMember", 0);
        setIntField(term291473, term291473.getClass(), "iconId", 0);
        setIntField(term291473, term291473.getClass(), "plateId", 0);
        setIntField(term291473, term291473.getClass(), "titleId", 0);
        setIntField(term291473, term291473.getClass(), "partnerId", 0);
        setIntField(term291473, term291473.getClass(), "frameId", 0);
        setIntField(term291473, term291473.getClass(), "selectMapId", 0);
        setIntField(term291473, term291473.getClass(), "totalAwake", 0);
        setIntField(term291473, term291473.getClass(), "gradeRating", 0);
        setIntField(term291473, term291473.getClass(), "musicRating", 0);
        setIntField(term291473, term291473.getClass(), "playerRating", 0);
        setIntField(term291473, term291473.getClass(), "highestRating", 0);
        setIntField(term291473, term291473.getClass(), "gradeRank", 0);
        setIntField(term291473, term291473.getClass(), "classRank", 0);
        setIntField(term291473, term291473.getClass(), "courseRank", 0);
        setField(term291473, term291473.getClass(), "charaSlot", null);
        setField(term291473, term291473.getClass(), "charaLockSlot", null);
        setLongField(term291473, term291473.getClass(), "contentBit", 0L);
        setIntField(term291473, term291473.getClass(), "playCount", 0);
        setField(term291473, term291473.getClass(), "eventWatchedDate", null);
        setField(term291473, term291473.getClass(), "lastGameId", null);
        setField(term291473, term291473.getClass(), "lastRomVersion", null);
        setField(term291473, term291473.getClass(), "lastDataVersion", null);
        setField(term291473, term291473.getClass(), "lastLoginDate", null);
        setField(term291473, term291473.getClass(), "lastPlayDate", null);
        setIntField(term291473, term291473.getClass(), "lastPlayCredit", 0);
        setIntField(term291473, term291473.getClass(), "lastPlayMode", 0);
        setIntField(term291473, term291473.getClass(), "lastPlaceId", 0);
        setField(term291473, term291473.getClass(), "lastPlaceName", null);
        setIntField(term291473, term291473.getClass(), "lastAllNetId", 0);
        setIntField(term291473, term291473.getClass(), "lastRegionId", 0);
        setField(term291473, term291473.getClass(), "lastRegionName", null);
        setField(term291473, term291473.getClass(), "lastClientId", null);
        setField(term291473, term291473.getClass(), "lastCountryCode", null);
        setIntField(term291473, term291473.getClass(), "lastSelectEMoney", 0);
        setIntField(term291473, term291473.getClass(), "lastSelectTicket", 0);
        setIntField(term291473, term291473.getClass(), "lastSelectCourse", 0);
        setIntField(term291473, term291473.getClass(), "lastCountCourse", 0);
        setField(term291473, term291473.getClass(), "firstGameId", null);
        setField(term291473, term291473.getClass(), "firstRomVersion", null);
        setField(term291473, term291473.getClass(), "firstDataVersion", null);
        setField(term291473, term291473.getClass(), "firstPlayDate", null);
        setField(term291473, term291473.getClass(), "compatibleCmVersion", null);
        setField(term291473, term291473.getClass(), "dailyBonusDate", null);
        setField(term291473, term291473.getClass(), "dailyCourseBonusDate", null);
        setField(term291473, term291473.getClass(), "lastPairLoginDate", null);
        setField(term291473, term291473.getClass(), "lastTrialPlayDate", null);
        setIntField(term291473, term291473.getClass(), "playVsCount", 0);
        setIntField(term291473, term291473.getClass(), "playSyncCount", 0);
        setIntField(term291473, term291473.getClass(), "winCount", 0);
        setIntField(term291473, term291473.getClass(), "helpCount", 0);
        setIntField(term291473, term291473.getClass(), "comboCount", 0);
        setLongField(term291473, term291473.getClass(), "totalDeluxscore", 0L);
        setLongField(term291473, term291473.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291473, term291473.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291473, term291473.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291473, term291473.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291473, term291473.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291473, term291473.getClass(), "totalSync", 0);
        setIntField(term291473, term291473.getClass(), "totalBasicSync", 0);
        setIntField(term291473, term291473.getClass(), "totalAdvancedSync", 0);
        setIntField(term291473, term291473.getClass(), "totalExpertSync", 0);
        setIntField(term291473, term291473.getClass(), "totalMasterSync", 0);
        setIntField(term291473, term291473.getClass(), "totalReMasterSync", 0);
        setLongField(term291473, term291473.getClass(), "totalAchievement", 0L);
        setLongField(term291473, term291473.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291473, term291473.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291473, term291473.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291473, term291473.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291473, term291473.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291473, term291473.getClass(), "playerOldRating", 0L);
        setLongField(term291473, term291473.getClass(), "playerNewRating", 0L);
        setIntField(term291473, term291473.getClass(), "banState", 0);
        setLongField(term291473, term291473.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCharaLockSlot", argTypes, term291473, args);
    }

};


