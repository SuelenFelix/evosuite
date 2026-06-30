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

public class UserDetail_setLastGameId_332473282260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291697;

    public UserDetail_setLastGameId_332473282260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291697 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291697, term291697.getClass(), "id", 0L);
        setField(term291697, term291697.getClass(), "card", null);
        setField(term291697, term291697.getClass(), "userName", null);
        setIntField(term291697, term291697.getClass(), "isNetMember", 0);
        setIntField(term291697, term291697.getClass(), "iconId", 0);
        setIntField(term291697, term291697.getClass(), "plateId", 0);
        setIntField(term291697, term291697.getClass(), "titleId", 0);
        setIntField(term291697, term291697.getClass(), "partnerId", 0);
        setIntField(term291697, term291697.getClass(), "frameId", 0);
        setIntField(term291697, term291697.getClass(), "selectMapId", 0);
        setIntField(term291697, term291697.getClass(), "totalAwake", 0);
        setIntField(term291697, term291697.getClass(), "gradeRating", 0);
        setIntField(term291697, term291697.getClass(), "musicRating", 0);
        setIntField(term291697, term291697.getClass(), "playerRating", 0);
        setIntField(term291697, term291697.getClass(), "highestRating", 0);
        setIntField(term291697, term291697.getClass(), "gradeRank", 0);
        setIntField(term291697, term291697.getClass(), "classRank", 0);
        setIntField(term291697, term291697.getClass(), "courseRank", 0);
        setField(term291697, term291697.getClass(), "charaSlot", null);
        setField(term291697, term291697.getClass(), "charaLockSlot", null);
        setLongField(term291697, term291697.getClass(), "contentBit", 0L);
        setIntField(term291697, term291697.getClass(), "playCount", 0);
        setField(term291697, term291697.getClass(), "eventWatchedDate", null);
        setField(term291697, term291697.getClass(), "lastGameId", null);
        setField(term291697, term291697.getClass(), "lastRomVersion", null);
        setField(term291697, term291697.getClass(), "lastDataVersion", null);
        setField(term291697, term291697.getClass(), "lastLoginDate", null);
        setField(term291697, term291697.getClass(), "lastPlayDate", null);
        setIntField(term291697, term291697.getClass(), "lastPlayCredit", 0);
        setIntField(term291697, term291697.getClass(), "lastPlayMode", 0);
        setIntField(term291697, term291697.getClass(), "lastPlaceId", 0);
        setField(term291697, term291697.getClass(), "lastPlaceName", null);
        setIntField(term291697, term291697.getClass(), "lastAllNetId", 0);
        setIntField(term291697, term291697.getClass(), "lastRegionId", 0);
        setField(term291697, term291697.getClass(), "lastRegionName", null);
        setField(term291697, term291697.getClass(), "lastClientId", null);
        setField(term291697, term291697.getClass(), "lastCountryCode", null);
        setIntField(term291697, term291697.getClass(), "lastSelectEMoney", 0);
        setIntField(term291697, term291697.getClass(), "lastSelectTicket", 0);
        setIntField(term291697, term291697.getClass(), "lastSelectCourse", 0);
        setIntField(term291697, term291697.getClass(), "lastCountCourse", 0);
        setField(term291697, term291697.getClass(), "firstGameId", null);
        setField(term291697, term291697.getClass(), "firstRomVersion", null);
        setField(term291697, term291697.getClass(), "firstDataVersion", null);
        setField(term291697, term291697.getClass(), "firstPlayDate", null);
        setField(term291697, term291697.getClass(), "compatibleCmVersion", null);
        setField(term291697, term291697.getClass(), "dailyBonusDate", null);
        setField(term291697, term291697.getClass(), "dailyCourseBonusDate", null);
        setField(term291697, term291697.getClass(), "lastPairLoginDate", null);
        setField(term291697, term291697.getClass(), "lastTrialPlayDate", null);
        setIntField(term291697, term291697.getClass(), "playVsCount", 0);
        setIntField(term291697, term291697.getClass(), "playSyncCount", 0);
        setIntField(term291697, term291697.getClass(), "winCount", 0);
        setIntField(term291697, term291697.getClass(), "helpCount", 0);
        setIntField(term291697, term291697.getClass(), "comboCount", 0);
        setLongField(term291697, term291697.getClass(), "totalDeluxscore", 0L);
        setLongField(term291697, term291697.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291697, term291697.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291697, term291697.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291697, term291697.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291697, term291697.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291697, term291697.getClass(), "totalSync", 0);
        setIntField(term291697, term291697.getClass(), "totalBasicSync", 0);
        setIntField(term291697, term291697.getClass(), "totalAdvancedSync", 0);
        setIntField(term291697, term291697.getClass(), "totalExpertSync", 0);
        setIntField(term291697, term291697.getClass(), "totalMasterSync", 0);
        setIntField(term291697, term291697.getClass(), "totalReMasterSync", 0);
        setLongField(term291697, term291697.getClass(), "totalAchievement", 0L);
        setLongField(term291697, term291697.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291697, term291697.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291697, term291697.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291697, term291697.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291697, term291697.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291697, term291697.getClass(), "playerOldRating", 0L);
        setLongField(term291697, term291697.getClass(), "playerNewRating", 0L);
        setIntField(term291697, term291697.getClass(), "banState", 0);
        setLongField(term291697, term291697.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastGameId", argTypes, term291697, args);
    }

};


