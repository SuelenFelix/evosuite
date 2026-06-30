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

public class UserDetail_setPlayCount_1258509161258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291585;
     Object term291640;

    public UserDetail_setPlayCount_1258509161258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291585 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291585, term291585.getClass(), "id", 0L);
        setField(term291585, term291585.getClass(), "card", null);
        setField(term291585, term291585.getClass(), "userName", null);
        setIntField(term291585, term291585.getClass(), "isNetMember", 0);
        setIntField(term291585, term291585.getClass(), "iconId", 0);
        setIntField(term291585, term291585.getClass(), "plateId", 0);
        setIntField(term291585, term291585.getClass(), "titleId", 0);
        setIntField(term291585, term291585.getClass(), "partnerId", 0);
        setIntField(term291585, term291585.getClass(), "frameId", 0);
        setIntField(term291585, term291585.getClass(), "selectMapId", 0);
        setIntField(term291585, term291585.getClass(), "totalAwake", 0);
        setIntField(term291585, term291585.getClass(), "gradeRating", 0);
        setIntField(term291585, term291585.getClass(), "musicRating", 0);
        setIntField(term291585, term291585.getClass(), "playerRating", 0);
        setIntField(term291585, term291585.getClass(), "highestRating", 0);
        setIntField(term291585, term291585.getClass(), "gradeRank", 0);
        setIntField(term291585, term291585.getClass(), "classRank", 0);
        setIntField(term291585, term291585.getClass(), "courseRank", 0);
        setField(term291585, term291585.getClass(), "charaSlot", null);
        setField(term291585, term291585.getClass(), "charaLockSlot", null);
        setLongField(term291585, term291585.getClass(), "contentBit", 0L);
        setIntField(term291585, term291585.getClass(), "playCount", 0);
        setField(term291585, term291585.getClass(), "eventWatchedDate", null);
        setField(term291585, term291585.getClass(), "lastGameId", null);
        setField(term291585, term291585.getClass(), "lastRomVersion", null);
        setField(term291585, term291585.getClass(), "lastDataVersion", null);
        setField(term291585, term291585.getClass(), "lastLoginDate", null);
        setField(term291585, term291585.getClass(), "lastPlayDate", null);
        setIntField(term291585, term291585.getClass(), "lastPlayCredit", 0);
        setIntField(term291585, term291585.getClass(), "lastPlayMode", 0);
        setIntField(term291585, term291585.getClass(), "lastPlaceId", 0);
        setField(term291585, term291585.getClass(), "lastPlaceName", null);
        setIntField(term291585, term291585.getClass(), "lastAllNetId", 0);
        setIntField(term291585, term291585.getClass(), "lastRegionId", 0);
        setField(term291585, term291585.getClass(), "lastRegionName", null);
        setField(term291585, term291585.getClass(), "lastClientId", null);
        setField(term291585, term291585.getClass(), "lastCountryCode", null);
        setIntField(term291585, term291585.getClass(), "lastSelectEMoney", 0);
        setIntField(term291585, term291585.getClass(), "lastSelectTicket", 0);
        setIntField(term291585, term291585.getClass(), "lastSelectCourse", 0);
        setIntField(term291585, term291585.getClass(), "lastCountCourse", 0);
        setField(term291585, term291585.getClass(), "firstGameId", null);
        setField(term291585, term291585.getClass(), "firstRomVersion", null);
        setField(term291585, term291585.getClass(), "firstDataVersion", null);
        setField(term291585, term291585.getClass(), "firstPlayDate", null);
        setField(term291585, term291585.getClass(), "compatibleCmVersion", null);
        setField(term291585, term291585.getClass(), "dailyBonusDate", null);
        setField(term291585, term291585.getClass(), "dailyCourseBonusDate", null);
        setField(term291585, term291585.getClass(), "lastPairLoginDate", null);
        setField(term291585, term291585.getClass(), "lastTrialPlayDate", null);
        setIntField(term291585, term291585.getClass(), "playVsCount", 0);
        setIntField(term291585, term291585.getClass(), "playSyncCount", 0);
        setIntField(term291585, term291585.getClass(), "winCount", 0);
        setIntField(term291585, term291585.getClass(), "helpCount", 0);
        setIntField(term291585, term291585.getClass(), "comboCount", 0);
        setLongField(term291585, term291585.getClass(), "totalDeluxscore", 0L);
        setLongField(term291585, term291585.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291585, term291585.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291585, term291585.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291585, term291585.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291585, term291585.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291585, term291585.getClass(), "totalSync", 0);
        setIntField(term291585, term291585.getClass(), "totalBasicSync", 0);
        setIntField(term291585, term291585.getClass(), "totalAdvancedSync", 0);
        setIntField(term291585, term291585.getClass(), "totalExpertSync", 0);
        setIntField(term291585, term291585.getClass(), "totalMasterSync", 0);
        setIntField(term291585, term291585.getClass(), "totalReMasterSync", 0);
        setLongField(term291585, term291585.getClass(), "totalAchievement", 0L);
        setLongField(term291585, term291585.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291585, term291585.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291585, term291585.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291585, term291585.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291585, term291585.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291585, term291585.getClass(), "playerOldRating", 0L);
        setLongField(term291585, term291585.getClass(), "playerNewRating", 0L);
        setIntField(term291585, term291585.getClass(), "banState", 0);
        setLongField(term291585, term291585.getClass(), "dateTime", 0L);
        term291640 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291640;
        callMethod(klass, "setPlayCount", argTypes, term291585, args);
    }

};


