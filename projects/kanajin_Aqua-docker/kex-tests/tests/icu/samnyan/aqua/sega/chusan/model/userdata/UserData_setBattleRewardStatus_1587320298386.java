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

public class UserData_setBattleRewardStatus_1587320298386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291414;
     Object term291491;

    public UserData_setBattleRewardStatus_1587320298386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291414 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291414, term291414.getClass(), "id", 0L);
        setField(term291414, term291414.getClass(), "card", null);
        setField(term291414, term291414.getClass(), "userName", null);
        setIntField(term291414, term291414.getClass(), "level", 0);
        setIntField(term291414, term291414.getClass(), "reincarnationNum", 0);
        setField(term291414, term291414.getClass(), "exp", null);
        setLongField(term291414, term291414.getClass(), "point", 0L);
        setLongField(term291414, term291414.getClass(), "totalPoint", 0L);
        setIntField(term291414, term291414.getClass(), "playCount", 0);
        setIntField(term291414, term291414.getClass(), "multiPlayCount", 0);
        setIntField(term291414, term291414.getClass(), "playerRating", 0);
        setIntField(term291414, term291414.getClass(), "highestRating", 0);
        setIntField(term291414, term291414.getClass(), "nameplateId", 0);
        setIntField(term291414, term291414.getClass(), "frameId", 0);
        setIntField(term291414, term291414.getClass(), "characterId", 0);
        setIntField(term291414, term291414.getClass(), "trophyId", 0);
        setIntField(term291414, term291414.getClass(), "playedTutorialBit", 0);
        setIntField(term291414, term291414.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291414, term291414.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291414, term291414.getClass(), "totalMapNum", 0);
        setLongField(term291414, term291414.getClass(), "totalHiScore", 0L);
        setLongField(term291414, term291414.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291414, term291414.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291414, term291414.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291414, term291414.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291414, term291414.getClass(), "totalUltimaHighScore", 0L);
        setField(term291414, term291414.getClass(), "eventWatchedDate", null);
        setIntField(term291414, term291414.getClass(), "friendCount", 0);
        setField(term291414, term291414.getClass(), "firstGameId", null);
        setField(term291414, term291414.getClass(), "firstRomVersion", null);
        setField(term291414, term291414.getClass(), "firstDataVersion", null);
        setField(term291414, term291414.getClass(), "firstPlayDate", null);
        setField(term291414, term291414.getClass(), "lastGameId", null);
        setField(term291414, term291414.getClass(), "lastRomVersion", null);
        setField(term291414, term291414.getClass(), "lastDataVersion", null);
        setField(term291414, term291414.getClass(), "lastLoginDate", null);
        setField(term291414, term291414.getClass(), "lastPlayDate", null);
        setIntField(term291414, term291414.getClass(), "lastPlaceId", 0);
        setField(term291414, term291414.getClass(), "lastPlaceName", null);
        setField(term291414, term291414.getClass(), "lastRegionId", null);
        setField(term291414, term291414.getClass(), "lastRegionName", null);
        setField(term291414, term291414.getClass(), "lastAllNetId", null);
        setField(term291414, term291414.getClass(), "lastClientId", null);
        setField(term291414, term291414.getClass(), "lastCountryCode", null);
        setField(term291414, term291414.getClass(), "userNameEx", null);
        setField(term291414, term291414.getClass(), "compatibleCmVersion", null);
        setIntField(term291414, term291414.getClass(), "medal", 0);
        setIntField(term291414, term291414.getClass(), "mapIconId", 0);
        setIntField(term291414, term291414.getClass(), "voiceId", 0);
        setIntField(term291414, term291414.getClass(), "avatarWear", 0);
        setIntField(term291414, term291414.getClass(), "avatarHead", 0);
        setIntField(term291414, term291414.getClass(), "avatarFace", 0);
        setIntField(term291414, term291414.getClass(), "avatarSkin", 0);
        setIntField(term291414, term291414.getClass(), "avatarItem", 0);
        setIntField(term291414, term291414.getClass(), "avatarFront", 0);
        setIntField(term291414, term291414.getClass(), "avatarBack", 0);
        setIntField(term291414, term291414.getClass(), "classEmblemBase", 0);
        setIntField(term291414, term291414.getClass(), "classEmblemMedal", 0);
        setIntField(term291414, term291414.getClass(), "stockedGridCount", 0);
        setIntField(term291414, term291414.getClass(), "exMapLoopCount", 0);
        setIntField(term291414, term291414.getClass(), "netBattlePlayCount", 0);
        setIntField(term291414, term291414.getClass(), "netBattleWinCount", 0);
        setIntField(term291414, term291414.getClass(), "netBattleLoseCount", 0);
        setIntField(term291414, term291414.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291414, term291414.getClass(), "charaIllustId", 0);
        setIntField(term291414, term291414.getClass(), "skillId", 0);
        setIntField(term291414, term291414.getClass(), "overPowerPoint", 0);
        setIntField(term291414, term291414.getClass(), "overPowerRate", 0);
        setIntField(term291414, term291414.getClass(), "overPowerLowerRank", 0);
        setIntField(term291414, term291414.getClass(), "avatarPoint", 0);
        setIntField(term291414, term291414.getClass(), "battleRankId", 0);
        setIntField(term291414, term291414.getClass(), "battleRankPoint", 0);
        setIntField(term291414, term291414.getClass(), "eliteRankPoint", 0);
        setIntField(term291414, term291414.getClass(), "netBattle1stCount", 0);
        setIntField(term291414, term291414.getClass(), "netBattle2ndCount", 0);
        setIntField(term291414, term291414.getClass(), "netBattle3rdCount", 0);
        setIntField(term291414, term291414.getClass(), "netBattle4thCount", 0);
        setIntField(term291414, term291414.getClass(), "netBattleCorrection", 0);
        setIntField(term291414, term291414.getClass(), "netBattleErrCnt", 0);
        setIntField(term291414, term291414.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291414, term291414.getClass(), "battleRewardStatus", 0);
        setIntField(term291414, term291414.getClass(), "battleRewardIndex", 0);
        setIntField(term291414, term291414.getClass(), "battleRewardCount", 0);
        setIntField(term291414, term291414.getClass(), "ext1", 0);
        setIntField(term291414, term291414.getClass(), "ext2", 0);
        setIntField(term291414, term291414.getClass(), "ext3", 0);
        setIntField(term291414, term291414.getClass(), "ext4", 0);
        setIntField(term291414, term291414.getClass(), "ext5", 0);
        setIntField(term291414, term291414.getClass(), "ext6", 0);
        setIntField(term291414, term291414.getClass(), "ext7", 0);
        setIntField(term291414, term291414.getClass(), "ext8", 0);
        setIntField(term291414, term291414.getClass(), "ext9", 0);
        setIntField(term291414, term291414.getClass(), "ext10", 0);
        setField(term291414, term291414.getClass(), "extStr1", null);
        setField(term291414, term291414.getClass(), "extStr2", null);
        setLongField(term291414, term291414.getClass(), "extLong1", 0L);
        setLongField(term291414, term291414.getClass(), "extLong2", 0L);
        setField(term291414, term291414.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291414, term291414.getClass(), "isNetBattleHost", false);
        setIntField(term291414, term291414.getClass(), "netBattleEndState", 0);
        term291491 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291491;
        callMethod(klass, "setBattleRewardStatus", argTypes, term291414, args);
    }

};


