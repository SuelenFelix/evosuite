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

public class UserData_setBattleRewardIndex_901105752387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291493;
     Object term291570;

    public UserData_setBattleRewardIndex_901105752387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291493 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291493, term291493.getClass(), "id", 0L);
        setField(term291493, term291493.getClass(), "card", null);
        setField(term291493, term291493.getClass(), "userName", null);
        setIntField(term291493, term291493.getClass(), "level", 0);
        setIntField(term291493, term291493.getClass(), "reincarnationNum", 0);
        setField(term291493, term291493.getClass(), "exp", null);
        setLongField(term291493, term291493.getClass(), "point", 0L);
        setLongField(term291493, term291493.getClass(), "totalPoint", 0L);
        setIntField(term291493, term291493.getClass(), "playCount", 0);
        setIntField(term291493, term291493.getClass(), "multiPlayCount", 0);
        setIntField(term291493, term291493.getClass(), "playerRating", 0);
        setIntField(term291493, term291493.getClass(), "highestRating", 0);
        setIntField(term291493, term291493.getClass(), "nameplateId", 0);
        setIntField(term291493, term291493.getClass(), "frameId", 0);
        setIntField(term291493, term291493.getClass(), "characterId", 0);
        setIntField(term291493, term291493.getClass(), "trophyId", 0);
        setIntField(term291493, term291493.getClass(), "playedTutorialBit", 0);
        setIntField(term291493, term291493.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291493, term291493.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291493, term291493.getClass(), "totalMapNum", 0);
        setLongField(term291493, term291493.getClass(), "totalHiScore", 0L);
        setLongField(term291493, term291493.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291493, term291493.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291493, term291493.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291493, term291493.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291493, term291493.getClass(), "totalUltimaHighScore", 0L);
        setField(term291493, term291493.getClass(), "eventWatchedDate", null);
        setIntField(term291493, term291493.getClass(), "friendCount", 0);
        setField(term291493, term291493.getClass(), "firstGameId", null);
        setField(term291493, term291493.getClass(), "firstRomVersion", null);
        setField(term291493, term291493.getClass(), "firstDataVersion", null);
        setField(term291493, term291493.getClass(), "firstPlayDate", null);
        setField(term291493, term291493.getClass(), "lastGameId", null);
        setField(term291493, term291493.getClass(), "lastRomVersion", null);
        setField(term291493, term291493.getClass(), "lastDataVersion", null);
        setField(term291493, term291493.getClass(), "lastLoginDate", null);
        setField(term291493, term291493.getClass(), "lastPlayDate", null);
        setIntField(term291493, term291493.getClass(), "lastPlaceId", 0);
        setField(term291493, term291493.getClass(), "lastPlaceName", null);
        setField(term291493, term291493.getClass(), "lastRegionId", null);
        setField(term291493, term291493.getClass(), "lastRegionName", null);
        setField(term291493, term291493.getClass(), "lastAllNetId", null);
        setField(term291493, term291493.getClass(), "lastClientId", null);
        setField(term291493, term291493.getClass(), "lastCountryCode", null);
        setField(term291493, term291493.getClass(), "userNameEx", null);
        setField(term291493, term291493.getClass(), "compatibleCmVersion", null);
        setIntField(term291493, term291493.getClass(), "medal", 0);
        setIntField(term291493, term291493.getClass(), "mapIconId", 0);
        setIntField(term291493, term291493.getClass(), "voiceId", 0);
        setIntField(term291493, term291493.getClass(), "avatarWear", 0);
        setIntField(term291493, term291493.getClass(), "avatarHead", 0);
        setIntField(term291493, term291493.getClass(), "avatarFace", 0);
        setIntField(term291493, term291493.getClass(), "avatarSkin", 0);
        setIntField(term291493, term291493.getClass(), "avatarItem", 0);
        setIntField(term291493, term291493.getClass(), "avatarFront", 0);
        setIntField(term291493, term291493.getClass(), "avatarBack", 0);
        setIntField(term291493, term291493.getClass(), "classEmblemBase", 0);
        setIntField(term291493, term291493.getClass(), "classEmblemMedal", 0);
        setIntField(term291493, term291493.getClass(), "stockedGridCount", 0);
        setIntField(term291493, term291493.getClass(), "exMapLoopCount", 0);
        setIntField(term291493, term291493.getClass(), "netBattlePlayCount", 0);
        setIntField(term291493, term291493.getClass(), "netBattleWinCount", 0);
        setIntField(term291493, term291493.getClass(), "netBattleLoseCount", 0);
        setIntField(term291493, term291493.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291493, term291493.getClass(), "charaIllustId", 0);
        setIntField(term291493, term291493.getClass(), "skillId", 0);
        setIntField(term291493, term291493.getClass(), "overPowerPoint", 0);
        setIntField(term291493, term291493.getClass(), "overPowerRate", 0);
        setIntField(term291493, term291493.getClass(), "overPowerLowerRank", 0);
        setIntField(term291493, term291493.getClass(), "avatarPoint", 0);
        setIntField(term291493, term291493.getClass(), "battleRankId", 0);
        setIntField(term291493, term291493.getClass(), "battleRankPoint", 0);
        setIntField(term291493, term291493.getClass(), "eliteRankPoint", 0);
        setIntField(term291493, term291493.getClass(), "netBattle1stCount", 0);
        setIntField(term291493, term291493.getClass(), "netBattle2ndCount", 0);
        setIntField(term291493, term291493.getClass(), "netBattle3rdCount", 0);
        setIntField(term291493, term291493.getClass(), "netBattle4thCount", 0);
        setIntField(term291493, term291493.getClass(), "netBattleCorrection", 0);
        setIntField(term291493, term291493.getClass(), "netBattleErrCnt", 0);
        setIntField(term291493, term291493.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291493, term291493.getClass(), "battleRewardStatus", 0);
        setIntField(term291493, term291493.getClass(), "battleRewardIndex", 0);
        setIntField(term291493, term291493.getClass(), "battleRewardCount", 0);
        setIntField(term291493, term291493.getClass(), "ext1", 0);
        setIntField(term291493, term291493.getClass(), "ext2", 0);
        setIntField(term291493, term291493.getClass(), "ext3", 0);
        setIntField(term291493, term291493.getClass(), "ext4", 0);
        setIntField(term291493, term291493.getClass(), "ext5", 0);
        setIntField(term291493, term291493.getClass(), "ext6", 0);
        setIntField(term291493, term291493.getClass(), "ext7", 0);
        setIntField(term291493, term291493.getClass(), "ext8", 0);
        setIntField(term291493, term291493.getClass(), "ext9", 0);
        setIntField(term291493, term291493.getClass(), "ext10", 0);
        setField(term291493, term291493.getClass(), "extStr1", null);
        setField(term291493, term291493.getClass(), "extStr2", null);
        setLongField(term291493, term291493.getClass(), "extLong1", 0L);
        setLongField(term291493, term291493.getClass(), "extLong2", 0L);
        setField(term291493, term291493.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291493, term291493.getClass(), "isNetBattleHost", false);
        setIntField(term291493, term291493.getClass(), "netBattleEndState", 0);
        term291570 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291570;
        callMethod(klass, "setBattleRewardIndex", argTypes, term291493, args);
    }

};


