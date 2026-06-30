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

public class UserData_setNetBattleCorrection_254071360383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291177;
     Object term291254;

    public UserData_setNetBattleCorrection_254071360383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291177 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291177, term291177.getClass(), "id", 0L);
        setField(term291177, term291177.getClass(), "card", null);
        setField(term291177, term291177.getClass(), "userName", null);
        setIntField(term291177, term291177.getClass(), "level", 0);
        setIntField(term291177, term291177.getClass(), "reincarnationNum", 0);
        setField(term291177, term291177.getClass(), "exp", null);
        setLongField(term291177, term291177.getClass(), "point", 0L);
        setLongField(term291177, term291177.getClass(), "totalPoint", 0L);
        setIntField(term291177, term291177.getClass(), "playCount", 0);
        setIntField(term291177, term291177.getClass(), "multiPlayCount", 0);
        setIntField(term291177, term291177.getClass(), "playerRating", 0);
        setIntField(term291177, term291177.getClass(), "highestRating", 0);
        setIntField(term291177, term291177.getClass(), "nameplateId", 0);
        setIntField(term291177, term291177.getClass(), "frameId", 0);
        setIntField(term291177, term291177.getClass(), "characterId", 0);
        setIntField(term291177, term291177.getClass(), "trophyId", 0);
        setIntField(term291177, term291177.getClass(), "playedTutorialBit", 0);
        setIntField(term291177, term291177.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291177, term291177.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291177, term291177.getClass(), "totalMapNum", 0);
        setLongField(term291177, term291177.getClass(), "totalHiScore", 0L);
        setLongField(term291177, term291177.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291177, term291177.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291177, term291177.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291177, term291177.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291177, term291177.getClass(), "totalUltimaHighScore", 0L);
        setField(term291177, term291177.getClass(), "eventWatchedDate", null);
        setIntField(term291177, term291177.getClass(), "friendCount", 0);
        setField(term291177, term291177.getClass(), "firstGameId", null);
        setField(term291177, term291177.getClass(), "firstRomVersion", null);
        setField(term291177, term291177.getClass(), "firstDataVersion", null);
        setField(term291177, term291177.getClass(), "firstPlayDate", null);
        setField(term291177, term291177.getClass(), "lastGameId", null);
        setField(term291177, term291177.getClass(), "lastRomVersion", null);
        setField(term291177, term291177.getClass(), "lastDataVersion", null);
        setField(term291177, term291177.getClass(), "lastLoginDate", null);
        setField(term291177, term291177.getClass(), "lastPlayDate", null);
        setIntField(term291177, term291177.getClass(), "lastPlaceId", 0);
        setField(term291177, term291177.getClass(), "lastPlaceName", null);
        setField(term291177, term291177.getClass(), "lastRegionId", null);
        setField(term291177, term291177.getClass(), "lastRegionName", null);
        setField(term291177, term291177.getClass(), "lastAllNetId", null);
        setField(term291177, term291177.getClass(), "lastClientId", null);
        setField(term291177, term291177.getClass(), "lastCountryCode", null);
        setField(term291177, term291177.getClass(), "userNameEx", null);
        setField(term291177, term291177.getClass(), "compatibleCmVersion", null);
        setIntField(term291177, term291177.getClass(), "medal", 0);
        setIntField(term291177, term291177.getClass(), "mapIconId", 0);
        setIntField(term291177, term291177.getClass(), "voiceId", 0);
        setIntField(term291177, term291177.getClass(), "avatarWear", 0);
        setIntField(term291177, term291177.getClass(), "avatarHead", 0);
        setIntField(term291177, term291177.getClass(), "avatarFace", 0);
        setIntField(term291177, term291177.getClass(), "avatarSkin", 0);
        setIntField(term291177, term291177.getClass(), "avatarItem", 0);
        setIntField(term291177, term291177.getClass(), "avatarFront", 0);
        setIntField(term291177, term291177.getClass(), "avatarBack", 0);
        setIntField(term291177, term291177.getClass(), "classEmblemBase", 0);
        setIntField(term291177, term291177.getClass(), "classEmblemMedal", 0);
        setIntField(term291177, term291177.getClass(), "stockedGridCount", 0);
        setIntField(term291177, term291177.getClass(), "exMapLoopCount", 0);
        setIntField(term291177, term291177.getClass(), "netBattlePlayCount", 0);
        setIntField(term291177, term291177.getClass(), "netBattleWinCount", 0);
        setIntField(term291177, term291177.getClass(), "netBattleLoseCount", 0);
        setIntField(term291177, term291177.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291177, term291177.getClass(), "charaIllustId", 0);
        setIntField(term291177, term291177.getClass(), "skillId", 0);
        setIntField(term291177, term291177.getClass(), "overPowerPoint", 0);
        setIntField(term291177, term291177.getClass(), "overPowerRate", 0);
        setIntField(term291177, term291177.getClass(), "overPowerLowerRank", 0);
        setIntField(term291177, term291177.getClass(), "avatarPoint", 0);
        setIntField(term291177, term291177.getClass(), "battleRankId", 0);
        setIntField(term291177, term291177.getClass(), "battleRankPoint", 0);
        setIntField(term291177, term291177.getClass(), "eliteRankPoint", 0);
        setIntField(term291177, term291177.getClass(), "netBattle1stCount", 0);
        setIntField(term291177, term291177.getClass(), "netBattle2ndCount", 0);
        setIntField(term291177, term291177.getClass(), "netBattle3rdCount", 0);
        setIntField(term291177, term291177.getClass(), "netBattle4thCount", 0);
        setIntField(term291177, term291177.getClass(), "netBattleCorrection", 0);
        setIntField(term291177, term291177.getClass(), "netBattleErrCnt", 0);
        setIntField(term291177, term291177.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291177, term291177.getClass(), "battleRewardStatus", 0);
        setIntField(term291177, term291177.getClass(), "battleRewardIndex", 0);
        setIntField(term291177, term291177.getClass(), "battleRewardCount", 0);
        setIntField(term291177, term291177.getClass(), "ext1", 0);
        setIntField(term291177, term291177.getClass(), "ext2", 0);
        setIntField(term291177, term291177.getClass(), "ext3", 0);
        setIntField(term291177, term291177.getClass(), "ext4", 0);
        setIntField(term291177, term291177.getClass(), "ext5", 0);
        setIntField(term291177, term291177.getClass(), "ext6", 0);
        setIntField(term291177, term291177.getClass(), "ext7", 0);
        setIntField(term291177, term291177.getClass(), "ext8", 0);
        setIntField(term291177, term291177.getClass(), "ext9", 0);
        setIntField(term291177, term291177.getClass(), "ext10", 0);
        setField(term291177, term291177.getClass(), "extStr1", null);
        setField(term291177, term291177.getClass(), "extStr2", null);
        setLongField(term291177, term291177.getClass(), "extLong1", 0L);
        setLongField(term291177, term291177.getClass(), "extLong2", 0L);
        setField(term291177, term291177.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291177, term291177.getClass(), "isNetBattleHost", false);
        setIntField(term291177, term291177.getClass(), "netBattleEndState", 0);
        term291254 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291254;
        callMethod(klass, "setNetBattleCorrection", argTypes, term291177, args);
    }

};


