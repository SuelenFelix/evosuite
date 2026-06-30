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

public class UserDetail_setMusicRating_416816446249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291076;
     Object term291131;

    public UserDetail_setMusicRating_416816446249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291076 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291076, term291076.getClass(), "id", 0L);
        setField(term291076, term291076.getClass(), "card", null);
        setField(term291076, term291076.getClass(), "userName", null);
        setIntField(term291076, term291076.getClass(), "isNetMember", 0);
        setIntField(term291076, term291076.getClass(), "iconId", 0);
        setIntField(term291076, term291076.getClass(), "plateId", 0);
        setIntField(term291076, term291076.getClass(), "titleId", 0);
        setIntField(term291076, term291076.getClass(), "partnerId", 0);
        setIntField(term291076, term291076.getClass(), "frameId", 0);
        setIntField(term291076, term291076.getClass(), "selectMapId", 0);
        setIntField(term291076, term291076.getClass(), "totalAwake", 0);
        setIntField(term291076, term291076.getClass(), "gradeRating", 0);
        setIntField(term291076, term291076.getClass(), "musicRating", 0);
        setIntField(term291076, term291076.getClass(), "playerRating", 0);
        setIntField(term291076, term291076.getClass(), "highestRating", 0);
        setIntField(term291076, term291076.getClass(), "gradeRank", 0);
        setIntField(term291076, term291076.getClass(), "classRank", 0);
        setIntField(term291076, term291076.getClass(), "courseRank", 0);
        setField(term291076, term291076.getClass(), "charaSlot", null);
        setField(term291076, term291076.getClass(), "charaLockSlot", null);
        setLongField(term291076, term291076.getClass(), "contentBit", 0L);
        setIntField(term291076, term291076.getClass(), "playCount", 0);
        setField(term291076, term291076.getClass(), "eventWatchedDate", null);
        setField(term291076, term291076.getClass(), "lastGameId", null);
        setField(term291076, term291076.getClass(), "lastRomVersion", null);
        setField(term291076, term291076.getClass(), "lastDataVersion", null);
        setField(term291076, term291076.getClass(), "lastLoginDate", null);
        setField(term291076, term291076.getClass(), "lastPlayDate", null);
        setIntField(term291076, term291076.getClass(), "lastPlayCredit", 0);
        setIntField(term291076, term291076.getClass(), "lastPlayMode", 0);
        setIntField(term291076, term291076.getClass(), "lastPlaceId", 0);
        setField(term291076, term291076.getClass(), "lastPlaceName", null);
        setIntField(term291076, term291076.getClass(), "lastAllNetId", 0);
        setIntField(term291076, term291076.getClass(), "lastRegionId", 0);
        setField(term291076, term291076.getClass(), "lastRegionName", null);
        setField(term291076, term291076.getClass(), "lastClientId", null);
        setField(term291076, term291076.getClass(), "lastCountryCode", null);
        setIntField(term291076, term291076.getClass(), "lastSelectEMoney", 0);
        setIntField(term291076, term291076.getClass(), "lastSelectTicket", 0);
        setIntField(term291076, term291076.getClass(), "lastSelectCourse", 0);
        setIntField(term291076, term291076.getClass(), "lastCountCourse", 0);
        setField(term291076, term291076.getClass(), "firstGameId", null);
        setField(term291076, term291076.getClass(), "firstRomVersion", null);
        setField(term291076, term291076.getClass(), "firstDataVersion", null);
        setField(term291076, term291076.getClass(), "firstPlayDate", null);
        setField(term291076, term291076.getClass(), "compatibleCmVersion", null);
        setField(term291076, term291076.getClass(), "dailyBonusDate", null);
        setField(term291076, term291076.getClass(), "dailyCourseBonusDate", null);
        setField(term291076, term291076.getClass(), "lastPairLoginDate", null);
        setField(term291076, term291076.getClass(), "lastTrialPlayDate", null);
        setIntField(term291076, term291076.getClass(), "playVsCount", 0);
        setIntField(term291076, term291076.getClass(), "playSyncCount", 0);
        setIntField(term291076, term291076.getClass(), "winCount", 0);
        setIntField(term291076, term291076.getClass(), "helpCount", 0);
        setIntField(term291076, term291076.getClass(), "comboCount", 0);
        setLongField(term291076, term291076.getClass(), "totalDeluxscore", 0L);
        setLongField(term291076, term291076.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291076, term291076.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291076, term291076.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291076, term291076.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291076, term291076.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291076, term291076.getClass(), "totalSync", 0);
        setIntField(term291076, term291076.getClass(), "totalBasicSync", 0);
        setIntField(term291076, term291076.getClass(), "totalAdvancedSync", 0);
        setIntField(term291076, term291076.getClass(), "totalExpertSync", 0);
        setIntField(term291076, term291076.getClass(), "totalMasterSync", 0);
        setIntField(term291076, term291076.getClass(), "totalReMasterSync", 0);
        setLongField(term291076, term291076.getClass(), "totalAchievement", 0L);
        setLongField(term291076, term291076.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291076, term291076.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291076, term291076.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291076, term291076.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291076, term291076.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291076, term291076.getClass(), "playerOldRating", 0L);
        setLongField(term291076, term291076.getClass(), "playerNewRating", 0L);
        setIntField(term291076, term291076.getClass(), "banState", 0);
        setLongField(term291076, term291076.getClass(), "dateTime", 0L);
        term291131 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291131;
        callMethod(klass, "setMusicRating", argTypes, term291076, args);
    }

};


