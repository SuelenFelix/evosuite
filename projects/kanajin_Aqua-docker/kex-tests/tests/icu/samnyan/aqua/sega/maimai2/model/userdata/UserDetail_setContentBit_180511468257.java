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

public class UserDetail_setContentBit_180511468257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291528;
     Object term291583;

    public UserDetail_setContentBit_180511468257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291528 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291528, term291528.getClass(), "id", 0L);
        setField(term291528, term291528.getClass(), "card", null);
        setField(term291528, term291528.getClass(), "userName", null);
        setIntField(term291528, term291528.getClass(), "isNetMember", 0);
        setIntField(term291528, term291528.getClass(), "iconId", 0);
        setIntField(term291528, term291528.getClass(), "plateId", 0);
        setIntField(term291528, term291528.getClass(), "titleId", 0);
        setIntField(term291528, term291528.getClass(), "partnerId", 0);
        setIntField(term291528, term291528.getClass(), "frameId", 0);
        setIntField(term291528, term291528.getClass(), "selectMapId", 0);
        setIntField(term291528, term291528.getClass(), "totalAwake", 0);
        setIntField(term291528, term291528.getClass(), "gradeRating", 0);
        setIntField(term291528, term291528.getClass(), "musicRating", 0);
        setIntField(term291528, term291528.getClass(), "playerRating", 0);
        setIntField(term291528, term291528.getClass(), "highestRating", 0);
        setIntField(term291528, term291528.getClass(), "gradeRank", 0);
        setIntField(term291528, term291528.getClass(), "classRank", 0);
        setIntField(term291528, term291528.getClass(), "courseRank", 0);
        setField(term291528, term291528.getClass(), "charaSlot", null);
        setField(term291528, term291528.getClass(), "charaLockSlot", null);
        setLongField(term291528, term291528.getClass(), "contentBit", 0L);
        setIntField(term291528, term291528.getClass(), "playCount", 0);
        setField(term291528, term291528.getClass(), "eventWatchedDate", null);
        setField(term291528, term291528.getClass(), "lastGameId", null);
        setField(term291528, term291528.getClass(), "lastRomVersion", null);
        setField(term291528, term291528.getClass(), "lastDataVersion", null);
        setField(term291528, term291528.getClass(), "lastLoginDate", null);
        setField(term291528, term291528.getClass(), "lastPlayDate", null);
        setIntField(term291528, term291528.getClass(), "lastPlayCredit", 0);
        setIntField(term291528, term291528.getClass(), "lastPlayMode", 0);
        setIntField(term291528, term291528.getClass(), "lastPlaceId", 0);
        setField(term291528, term291528.getClass(), "lastPlaceName", null);
        setIntField(term291528, term291528.getClass(), "lastAllNetId", 0);
        setIntField(term291528, term291528.getClass(), "lastRegionId", 0);
        setField(term291528, term291528.getClass(), "lastRegionName", null);
        setField(term291528, term291528.getClass(), "lastClientId", null);
        setField(term291528, term291528.getClass(), "lastCountryCode", null);
        setIntField(term291528, term291528.getClass(), "lastSelectEMoney", 0);
        setIntField(term291528, term291528.getClass(), "lastSelectTicket", 0);
        setIntField(term291528, term291528.getClass(), "lastSelectCourse", 0);
        setIntField(term291528, term291528.getClass(), "lastCountCourse", 0);
        setField(term291528, term291528.getClass(), "firstGameId", null);
        setField(term291528, term291528.getClass(), "firstRomVersion", null);
        setField(term291528, term291528.getClass(), "firstDataVersion", null);
        setField(term291528, term291528.getClass(), "firstPlayDate", null);
        setField(term291528, term291528.getClass(), "compatibleCmVersion", null);
        setField(term291528, term291528.getClass(), "dailyBonusDate", null);
        setField(term291528, term291528.getClass(), "dailyCourseBonusDate", null);
        setField(term291528, term291528.getClass(), "lastPairLoginDate", null);
        setField(term291528, term291528.getClass(), "lastTrialPlayDate", null);
        setIntField(term291528, term291528.getClass(), "playVsCount", 0);
        setIntField(term291528, term291528.getClass(), "playSyncCount", 0);
        setIntField(term291528, term291528.getClass(), "winCount", 0);
        setIntField(term291528, term291528.getClass(), "helpCount", 0);
        setIntField(term291528, term291528.getClass(), "comboCount", 0);
        setLongField(term291528, term291528.getClass(), "totalDeluxscore", 0L);
        setLongField(term291528, term291528.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291528, term291528.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291528, term291528.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291528, term291528.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291528, term291528.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291528, term291528.getClass(), "totalSync", 0);
        setIntField(term291528, term291528.getClass(), "totalBasicSync", 0);
        setIntField(term291528, term291528.getClass(), "totalAdvancedSync", 0);
        setIntField(term291528, term291528.getClass(), "totalExpertSync", 0);
        setIntField(term291528, term291528.getClass(), "totalMasterSync", 0);
        setIntField(term291528, term291528.getClass(), "totalReMasterSync", 0);
        setLongField(term291528, term291528.getClass(), "totalAchievement", 0L);
        setLongField(term291528, term291528.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291528, term291528.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291528, term291528.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291528, term291528.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291528, term291528.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291528, term291528.getClass(), "playerOldRating", 0L);
        setLongField(term291528, term291528.getClass(), "playerNewRating", 0L);
        setIntField(term291528, term291528.getClass(), "banState", 0);
        setLongField(term291528, term291528.getClass(), "dateTime", 0L);
        term291583 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term291583;
        callMethod(klass, "setContentBit", argTypes, term291528, args);
    }

};


