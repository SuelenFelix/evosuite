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

public class UserDetail_setGradeRank_2127578881252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291247;
     Object term291302;

    public UserDetail_setGradeRank_2127578881252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291247 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291247, term291247.getClass(), "id", 0L);
        setField(term291247, term291247.getClass(), "card", null);
        setField(term291247, term291247.getClass(), "userName", null);
        setIntField(term291247, term291247.getClass(), "isNetMember", 0);
        setIntField(term291247, term291247.getClass(), "iconId", 0);
        setIntField(term291247, term291247.getClass(), "plateId", 0);
        setIntField(term291247, term291247.getClass(), "titleId", 0);
        setIntField(term291247, term291247.getClass(), "partnerId", 0);
        setIntField(term291247, term291247.getClass(), "frameId", 0);
        setIntField(term291247, term291247.getClass(), "selectMapId", 0);
        setIntField(term291247, term291247.getClass(), "totalAwake", 0);
        setIntField(term291247, term291247.getClass(), "gradeRating", 0);
        setIntField(term291247, term291247.getClass(), "musicRating", 0);
        setIntField(term291247, term291247.getClass(), "playerRating", 0);
        setIntField(term291247, term291247.getClass(), "highestRating", 0);
        setIntField(term291247, term291247.getClass(), "gradeRank", 0);
        setIntField(term291247, term291247.getClass(), "classRank", 0);
        setIntField(term291247, term291247.getClass(), "courseRank", 0);
        setField(term291247, term291247.getClass(), "charaSlot", null);
        setField(term291247, term291247.getClass(), "charaLockSlot", null);
        setLongField(term291247, term291247.getClass(), "contentBit", 0L);
        setIntField(term291247, term291247.getClass(), "playCount", 0);
        setField(term291247, term291247.getClass(), "eventWatchedDate", null);
        setField(term291247, term291247.getClass(), "lastGameId", null);
        setField(term291247, term291247.getClass(), "lastRomVersion", null);
        setField(term291247, term291247.getClass(), "lastDataVersion", null);
        setField(term291247, term291247.getClass(), "lastLoginDate", null);
        setField(term291247, term291247.getClass(), "lastPlayDate", null);
        setIntField(term291247, term291247.getClass(), "lastPlayCredit", 0);
        setIntField(term291247, term291247.getClass(), "lastPlayMode", 0);
        setIntField(term291247, term291247.getClass(), "lastPlaceId", 0);
        setField(term291247, term291247.getClass(), "lastPlaceName", null);
        setIntField(term291247, term291247.getClass(), "lastAllNetId", 0);
        setIntField(term291247, term291247.getClass(), "lastRegionId", 0);
        setField(term291247, term291247.getClass(), "lastRegionName", null);
        setField(term291247, term291247.getClass(), "lastClientId", null);
        setField(term291247, term291247.getClass(), "lastCountryCode", null);
        setIntField(term291247, term291247.getClass(), "lastSelectEMoney", 0);
        setIntField(term291247, term291247.getClass(), "lastSelectTicket", 0);
        setIntField(term291247, term291247.getClass(), "lastSelectCourse", 0);
        setIntField(term291247, term291247.getClass(), "lastCountCourse", 0);
        setField(term291247, term291247.getClass(), "firstGameId", null);
        setField(term291247, term291247.getClass(), "firstRomVersion", null);
        setField(term291247, term291247.getClass(), "firstDataVersion", null);
        setField(term291247, term291247.getClass(), "firstPlayDate", null);
        setField(term291247, term291247.getClass(), "compatibleCmVersion", null);
        setField(term291247, term291247.getClass(), "dailyBonusDate", null);
        setField(term291247, term291247.getClass(), "dailyCourseBonusDate", null);
        setField(term291247, term291247.getClass(), "lastPairLoginDate", null);
        setField(term291247, term291247.getClass(), "lastTrialPlayDate", null);
        setIntField(term291247, term291247.getClass(), "playVsCount", 0);
        setIntField(term291247, term291247.getClass(), "playSyncCount", 0);
        setIntField(term291247, term291247.getClass(), "winCount", 0);
        setIntField(term291247, term291247.getClass(), "helpCount", 0);
        setIntField(term291247, term291247.getClass(), "comboCount", 0);
        setLongField(term291247, term291247.getClass(), "totalDeluxscore", 0L);
        setLongField(term291247, term291247.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291247, term291247.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291247, term291247.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291247, term291247.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291247, term291247.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291247, term291247.getClass(), "totalSync", 0);
        setIntField(term291247, term291247.getClass(), "totalBasicSync", 0);
        setIntField(term291247, term291247.getClass(), "totalAdvancedSync", 0);
        setIntField(term291247, term291247.getClass(), "totalExpertSync", 0);
        setIntField(term291247, term291247.getClass(), "totalMasterSync", 0);
        setIntField(term291247, term291247.getClass(), "totalReMasterSync", 0);
        setLongField(term291247, term291247.getClass(), "totalAchievement", 0L);
        setLongField(term291247, term291247.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291247, term291247.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291247, term291247.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291247, term291247.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291247, term291247.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291247, term291247.getClass(), "playerOldRating", 0L);
        setLongField(term291247, term291247.getClass(), "playerNewRating", 0L);
        setIntField(term291247, term291247.getClass(), "banState", 0);
        setLongField(term291247, term291247.getClass(), "dateTime", 0L);
        term291302 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291302;
        callMethod(klass, "setGradeRank", argTypes, term291247, args);
    }

};


