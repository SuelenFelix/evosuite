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

public class UserDetail_setHighestRating_1288026429251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291190;
     Object term291245;

    public UserDetail_setHighestRating_1288026429251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291190 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291190, term291190.getClass(), "id", 0L);
        setField(term291190, term291190.getClass(), "card", null);
        setField(term291190, term291190.getClass(), "userName", null);
        setIntField(term291190, term291190.getClass(), "isNetMember", 0);
        setIntField(term291190, term291190.getClass(), "iconId", 0);
        setIntField(term291190, term291190.getClass(), "plateId", 0);
        setIntField(term291190, term291190.getClass(), "titleId", 0);
        setIntField(term291190, term291190.getClass(), "partnerId", 0);
        setIntField(term291190, term291190.getClass(), "frameId", 0);
        setIntField(term291190, term291190.getClass(), "selectMapId", 0);
        setIntField(term291190, term291190.getClass(), "totalAwake", 0);
        setIntField(term291190, term291190.getClass(), "gradeRating", 0);
        setIntField(term291190, term291190.getClass(), "musicRating", 0);
        setIntField(term291190, term291190.getClass(), "playerRating", 0);
        setIntField(term291190, term291190.getClass(), "highestRating", 0);
        setIntField(term291190, term291190.getClass(), "gradeRank", 0);
        setIntField(term291190, term291190.getClass(), "classRank", 0);
        setIntField(term291190, term291190.getClass(), "courseRank", 0);
        setField(term291190, term291190.getClass(), "charaSlot", null);
        setField(term291190, term291190.getClass(), "charaLockSlot", null);
        setLongField(term291190, term291190.getClass(), "contentBit", 0L);
        setIntField(term291190, term291190.getClass(), "playCount", 0);
        setField(term291190, term291190.getClass(), "eventWatchedDate", null);
        setField(term291190, term291190.getClass(), "lastGameId", null);
        setField(term291190, term291190.getClass(), "lastRomVersion", null);
        setField(term291190, term291190.getClass(), "lastDataVersion", null);
        setField(term291190, term291190.getClass(), "lastLoginDate", null);
        setField(term291190, term291190.getClass(), "lastPlayDate", null);
        setIntField(term291190, term291190.getClass(), "lastPlayCredit", 0);
        setIntField(term291190, term291190.getClass(), "lastPlayMode", 0);
        setIntField(term291190, term291190.getClass(), "lastPlaceId", 0);
        setField(term291190, term291190.getClass(), "lastPlaceName", null);
        setIntField(term291190, term291190.getClass(), "lastAllNetId", 0);
        setIntField(term291190, term291190.getClass(), "lastRegionId", 0);
        setField(term291190, term291190.getClass(), "lastRegionName", null);
        setField(term291190, term291190.getClass(), "lastClientId", null);
        setField(term291190, term291190.getClass(), "lastCountryCode", null);
        setIntField(term291190, term291190.getClass(), "lastSelectEMoney", 0);
        setIntField(term291190, term291190.getClass(), "lastSelectTicket", 0);
        setIntField(term291190, term291190.getClass(), "lastSelectCourse", 0);
        setIntField(term291190, term291190.getClass(), "lastCountCourse", 0);
        setField(term291190, term291190.getClass(), "firstGameId", null);
        setField(term291190, term291190.getClass(), "firstRomVersion", null);
        setField(term291190, term291190.getClass(), "firstDataVersion", null);
        setField(term291190, term291190.getClass(), "firstPlayDate", null);
        setField(term291190, term291190.getClass(), "compatibleCmVersion", null);
        setField(term291190, term291190.getClass(), "dailyBonusDate", null);
        setField(term291190, term291190.getClass(), "dailyCourseBonusDate", null);
        setField(term291190, term291190.getClass(), "lastPairLoginDate", null);
        setField(term291190, term291190.getClass(), "lastTrialPlayDate", null);
        setIntField(term291190, term291190.getClass(), "playVsCount", 0);
        setIntField(term291190, term291190.getClass(), "playSyncCount", 0);
        setIntField(term291190, term291190.getClass(), "winCount", 0);
        setIntField(term291190, term291190.getClass(), "helpCount", 0);
        setIntField(term291190, term291190.getClass(), "comboCount", 0);
        setLongField(term291190, term291190.getClass(), "totalDeluxscore", 0L);
        setLongField(term291190, term291190.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291190, term291190.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291190, term291190.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291190, term291190.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291190, term291190.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291190, term291190.getClass(), "totalSync", 0);
        setIntField(term291190, term291190.getClass(), "totalBasicSync", 0);
        setIntField(term291190, term291190.getClass(), "totalAdvancedSync", 0);
        setIntField(term291190, term291190.getClass(), "totalExpertSync", 0);
        setIntField(term291190, term291190.getClass(), "totalMasterSync", 0);
        setIntField(term291190, term291190.getClass(), "totalReMasterSync", 0);
        setLongField(term291190, term291190.getClass(), "totalAchievement", 0L);
        setLongField(term291190, term291190.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291190, term291190.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291190, term291190.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291190, term291190.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291190, term291190.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291190, term291190.getClass(), "playerOldRating", 0L);
        setLongField(term291190, term291190.getClass(), "playerNewRating", 0L);
        setIntField(term291190, term291190.getClass(), "banState", 0);
        setLongField(term291190, term291190.getClass(), "dateTime", 0L);
        term291245 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291245;
        callMethod(klass, "setHighestRating", argTypes, term291190, args);
    }

};


