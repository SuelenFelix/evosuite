package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserData_setTotalAdvancedHighScore_337867995328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286868;
     Object term286945;

    public UserData_setTotalAdvancedHighScore_337867995328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286868 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286868, term286868.getClass(), "id", 0L);
        setField(term286868, term286868.getClass(), "card", null);
        setField(term286868, term286868.getClass(), "userName", null);
        setIntField(term286868, term286868.getClass(), "level", 0);
        setIntField(term286868, term286868.getClass(), "reincarnationNum", 0);
        setField(term286868, term286868.getClass(), "exp", null);
        setLongField(term286868, term286868.getClass(), "point", 0L);
        setLongField(term286868, term286868.getClass(), "totalPoint", 0L);
        setIntField(term286868, term286868.getClass(), "playCount", 0);
        setIntField(term286868, term286868.getClass(), "multiPlayCount", 0);
        setIntField(term286868, term286868.getClass(), "playerRating", 0);
        setIntField(term286868, term286868.getClass(), "highestRating", 0);
        setIntField(term286868, term286868.getClass(), "nameplateId", 0);
        setIntField(term286868, term286868.getClass(), "frameId", 0);
        setIntField(term286868, term286868.getClass(), "characterId", 0);
        setIntField(term286868, term286868.getClass(), "trophyId", 0);
        setIntField(term286868, term286868.getClass(), "playedTutorialBit", 0);
        setIntField(term286868, term286868.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286868, term286868.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286868, term286868.getClass(), "totalMapNum", 0);
        setLongField(term286868, term286868.getClass(), "totalHiScore", 0L);
        setLongField(term286868, term286868.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286868, term286868.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286868, term286868.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286868, term286868.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286868, term286868.getClass(), "totalUltimaHighScore", 0L);
        setField(term286868, term286868.getClass(), "eventWatchedDate", null);
        setIntField(term286868, term286868.getClass(), "friendCount", 0);
        setField(term286868, term286868.getClass(), "firstGameId", null);
        setField(term286868, term286868.getClass(), "firstRomVersion", null);
        setField(term286868, term286868.getClass(), "firstDataVersion", null);
        setField(term286868, term286868.getClass(), "firstPlayDate", null);
        setField(term286868, term286868.getClass(), "lastGameId", null);
        setField(term286868, term286868.getClass(), "lastRomVersion", null);
        setField(term286868, term286868.getClass(), "lastDataVersion", null);
        setField(term286868, term286868.getClass(), "lastLoginDate", null);
        setField(term286868, term286868.getClass(), "lastPlayDate", null);
        setIntField(term286868, term286868.getClass(), "lastPlaceId", 0);
        setField(term286868, term286868.getClass(), "lastPlaceName", null);
        setField(term286868, term286868.getClass(), "lastRegionId", null);
        setField(term286868, term286868.getClass(), "lastRegionName", null);
        setField(term286868, term286868.getClass(), "lastAllNetId", null);
        setField(term286868, term286868.getClass(), "lastClientId", null);
        setField(term286868, term286868.getClass(), "lastCountryCode", null);
        setField(term286868, term286868.getClass(), "userNameEx", null);
        setField(term286868, term286868.getClass(), "compatibleCmVersion", null);
        setIntField(term286868, term286868.getClass(), "medal", 0);
        setIntField(term286868, term286868.getClass(), "mapIconId", 0);
        setIntField(term286868, term286868.getClass(), "voiceId", 0);
        setIntField(term286868, term286868.getClass(), "avatarWear", 0);
        setIntField(term286868, term286868.getClass(), "avatarHead", 0);
        setIntField(term286868, term286868.getClass(), "avatarFace", 0);
        setIntField(term286868, term286868.getClass(), "avatarSkin", 0);
        setIntField(term286868, term286868.getClass(), "avatarItem", 0);
        setIntField(term286868, term286868.getClass(), "avatarFront", 0);
        setIntField(term286868, term286868.getClass(), "avatarBack", 0);
        setIntField(term286868, term286868.getClass(), "classEmblemBase", 0);
        setIntField(term286868, term286868.getClass(), "classEmblemMedal", 0);
        setIntField(term286868, term286868.getClass(), "stockedGridCount", 0);
        setIntField(term286868, term286868.getClass(), "exMapLoopCount", 0);
        setIntField(term286868, term286868.getClass(), "netBattlePlayCount", 0);
        setIntField(term286868, term286868.getClass(), "netBattleWinCount", 0);
        setIntField(term286868, term286868.getClass(), "netBattleLoseCount", 0);
        setIntField(term286868, term286868.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286868, term286868.getClass(), "charaIllustId", 0);
        setIntField(term286868, term286868.getClass(), "skillId", 0);
        setIntField(term286868, term286868.getClass(), "overPowerPoint", 0);
        setIntField(term286868, term286868.getClass(), "overPowerRate", 0);
        setIntField(term286868, term286868.getClass(), "overPowerLowerRank", 0);
        setIntField(term286868, term286868.getClass(), "avatarPoint", 0);
        setIntField(term286868, term286868.getClass(), "battleRankId", 0);
        setIntField(term286868, term286868.getClass(), "battleRankPoint", 0);
        setIntField(term286868, term286868.getClass(), "eliteRankPoint", 0);
        setIntField(term286868, term286868.getClass(), "netBattle1stCount", 0);
        setIntField(term286868, term286868.getClass(), "netBattle2ndCount", 0);
        setIntField(term286868, term286868.getClass(), "netBattle3rdCount", 0);
        setIntField(term286868, term286868.getClass(), "netBattle4thCount", 0);
        setIntField(term286868, term286868.getClass(), "netBattleCorrection", 0);
        setIntField(term286868, term286868.getClass(), "netBattleErrCnt", 0);
        setIntField(term286868, term286868.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286868, term286868.getClass(), "battleRewardStatus", 0);
        setIntField(term286868, term286868.getClass(), "battleRewardIndex", 0);
        setIntField(term286868, term286868.getClass(), "battleRewardCount", 0);
        setIntField(term286868, term286868.getClass(), "ext1", 0);
        setIntField(term286868, term286868.getClass(), "ext2", 0);
        setIntField(term286868, term286868.getClass(), "ext3", 0);
        setIntField(term286868, term286868.getClass(), "ext4", 0);
        setIntField(term286868, term286868.getClass(), "ext5", 0);
        setIntField(term286868, term286868.getClass(), "ext6", 0);
        setIntField(term286868, term286868.getClass(), "ext7", 0);
        setIntField(term286868, term286868.getClass(), "ext8", 0);
        setIntField(term286868, term286868.getClass(), "ext9", 0);
        setIntField(term286868, term286868.getClass(), "ext10", 0);
        setField(term286868, term286868.getClass(), "extStr1", null);
        setField(term286868, term286868.getClass(), "extStr2", null);
        setLongField(term286868, term286868.getClass(), "extLong1", 0L);
        setLongField(term286868, term286868.getClass(), "extLong2", 0L);
        setField(term286868, term286868.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286868, term286868.getClass(), "isNetBattleHost", false);
        setIntField(term286868, term286868.getClass(), "netBattleEndState", 0);
        term286945 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term286945;
        callMethod(klass, "setTotalAdvancedHighScore", argTypes, term286868, args);
    }

};


