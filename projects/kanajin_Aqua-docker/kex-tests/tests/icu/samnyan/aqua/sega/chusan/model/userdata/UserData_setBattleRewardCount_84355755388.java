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
import java.lang.Integer;

public class UserData_setBattleRewardCount_84355755388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291572;
     Object term291649;

    public UserData_setBattleRewardCount_84355755388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291572 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291572, term291572.getClass(), "id", 0L);
        setField(term291572, term291572.getClass(), "card", null);
        setField(term291572, term291572.getClass(), "userName", null);
        setIntField(term291572, term291572.getClass(), "level", 0);
        setIntField(term291572, term291572.getClass(), "reincarnationNum", 0);
        setField(term291572, term291572.getClass(), "exp", null);
        setLongField(term291572, term291572.getClass(), "point", 0L);
        setLongField(term291572, term291572.getClass(), "totalPoint", 0L);
        setIntField(term291572, term291572.getClass(), "playCount", 0);
        setIntField(term291572, term291572.getClass(), "multiPlayCount", 0);
        setIntField(term291572, term291572.getClass(), "playerRating", 0);
        setIntField(term291572, term291572.getClass(), "highestRating", 0);
        setIntField(term291572, term291572.getClass(), "nameplateId", 0);
        setIntField(term291572, term291572.getClass(), "frameId", 0);
        setIntField(term291572, term291572.getClass(), "characterId", 0);
        setIntField(term291572, term291572.getClass(), "trophyId", 0);
        setIntField(term291572, term291572.getClass(), "playedTutorialBit", 0);
        setIntField(term291572, term291572.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291572, term291572.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291572, term291572.getClass(), "totalMapNum", 0);
        setLongField(term291572, term291572.getClass(), "totalHiScore", 0L);
        setLongField(term291572, term291572.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291572, term291572.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291572, term291572.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291572, term291572.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291572, term291572.getClass(), "totalUltimaHighScore", 0L);
        setField(term291572, term291572.getClass(), "eventWatchedDate", null);
        setIntField(term291572, term291572.getClass(), "friendCount", 0);
        setField(term291572, term291572.getClass(), "firstGameId", null);
        setField(term291572, term291572.getClass(), "firstRomVersion", null);
        setField(term291572, term291572.getClass(), "firstDataVersion", null);
        setField(term291572, term291572.getClass(), "firstPlayDate", null);
        setField(term291572, term291572.getClass(), "lastGameId", null);
        setField(term291572, term291572.getClass(), "lastRomVersion", null);
        setField(term291572, term291572.getClass(), "lastDataVersion", null);
        setField(term291572, term291572.getClass(), "lastLoginDate", null);
        setField(term291572, term291572.getClass(), "lastPlayDate", null);
        setIntField(term291572, term291572.getClass(), "lastPlaceId", 0);
        setField(term291572, term291572.getClass(), "lastPlaceName", null);
        setField(term291572, term291572.getClass(), "lastRegionId", null);
        setField(term291572, term291572.getClass(), "lastRegionName", null);
        setField(term291572, term291572.getClass(), "lastAllNetId", null);
        setField(term291572, term291572.getClass(), "lastClientId", null);
        setField(term291572, term291572.getClass(), "lastCountryCode", null);
        setField(term291572, term291572.getClass(), "userNameEx", null);
        setField(term291572, term291572.getClass(), "compatibleCmVersion", null);
        setIntField(term291572, term291572.getClass(), "medal", 0);
        setIntField(term291572, term291572.getClass(), "mapIconId", 0);
        setIntField(term291572, term291572.getClass(), "voiceId", 0);
        setIntField(term291572, term291572.getClass(), "avatarWear", 0);
        setIntField(term291572, term291572.getClass(), "avatarHead", 0);
        setIntField(term291572, term291572.getClass(), "avatarFace", 0);
        setIntField(term291572, term291572.getClass(), "avatarSkin", 0);
        setIntField(term291572, term291572.getClass(), "avatarItem", 0);
        setIntField(term291572, term291572.getClass(), "avatarFront", 0);
        setIntField(term291572, term291572.getClass(), "avatarBack", 0);
        setIntField(term291572, term291572.getClass(), "classEmblemBase", 0);
        setIntField(term291572, term291572.getClass(), "classEmblemMedal", 0);
        setIntField(term291572, term291572.getClass(), "stockedGridCount", 0);
        setIntField(term291572, term291572.getClass(), "exMapLoopCount", 0);
        setIntField(term291572, term291572.getClass(), "netBattlePlayCount", 0);
        setIntField(term291572, term291572.getClass(), "netBattleWinCount", 0);
        setIntField(term291572, term291572.getClass(), "netBattleLoseCount", 0);
        setIntField(term291572, term291572.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291572, term291572.getClass(), "charaIllustId", 0);
        setIntField(term291572, term291572.getClass(), "skillId", 0);
        setIntField(term291572, term291572.getClass(), "overPowerPoint", 0);
        setIntField(term291572, term291572.getClass(), "overPowerRate", 0);
        setIntField(term291572, term291572.getClass(), "overPowerLowerRank", 0);
        setIntField(term291572, term291572.getClass(), "avatarPoint", 0);
        setIntField(term291572, term291572.getClass(), "battleRankId", 0);
        setIntField(term291572, term291572.getClass(), "battleRankPoint", 0);
        setIntField(term291572, term291572.getClass(), "eliteRankPoint", 0);
        setIntField(term291572, term291572.getClass(), "netBattle1stCount", 0);
        setIntField(term291572, term291572.getClass(), "netBattle2ndCount", 0);
        setIntField(term291572, term291572.getClass(), "netBattle3rdCount", 0);
        setIntField(term291572, term291572.getClass(), "netBattle4thCount", 0);
        setIntField(term291572, term291572.getClass(), "netBattleCorrection", 0);
        setIntField(term291572, term291572.getClass(), "netBattleErrCnt", 0);
        setIntField(term291572, term291572.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291572, term291572.getClass(), "battleRewardStatus", 0);
        setIntField(term291572, term291572.getClass(), "battleRewardIndex", 0);
        setIntField(term291572, term291572.getClass(), "battleRewardCount", 0);
        setIntField(term291572, term291572.getClass(), "ext1", 0);
        setIntField(term291572, term291572.getClass(), "ext2", 0);
        setIntField(term291572, term291572.getClass(), "ext3", 0);
        setIntField(term291572, term291572.getClass(), "ext4", 0);
        setIntField(term291572, term291572.getClass(), "ext5", 0);
        setIntField(term291572, term291572.getClass(), "ext6", 0);
        setIntField(term291572, term291572.getClass(), "ext7", 0);
        setIntField(term291572, term291572.getClass(), "ext8", 0);
        setIntField(term291572, term291572.getClass(), "ext9", 0);
        setIntField(term291572, term291572.getClass(), "ext10", 0);
        setField(term291572, term291572.getClass(), "extStr1", null);
        setField(term291572, term291572.getClass(), "extStr2", null);
        setLongField(term291572, term291572.getClass(), "extLong1", 0L);
        setLongField(term291572, term291572.getClass(), "extLong2", 0L);
        setField(term291572, term291572.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291572, term291572.getClass(), "isNetBattleHost", false);
        setIntField(term291572, term291572.getClass(), "netBattleEndState", 0);
        term291649 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291649;
        callMethod(klass, "setBattleRewardCount", argTypes, term291572, args);
    }

};


