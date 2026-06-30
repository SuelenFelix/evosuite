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

public class UserData_setNetBattlePlayCount_1181095639366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289834;
     Object term289911;

    public UserData_setNetBattlePlayCount_1181095639366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289834 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289834, term289834.getClass(), "id", 0L);
        setField(term289834, term289834.getClass(), "card", null);
        setField(term289834, term289834.getClass(), "userName", null);
        setIntField(term289834, term289834.getClass(), "level", 0);
        setIntField(term289834, term289834.getClass(), "reincarnationNum", 0);
        setField(term289834, term289834.getClass(), "exp", null);
        setLongField(term289834, term289834.getClass(), "point", 0L);
        setLongField(term289834, term289834.getClass(), "totalPoint", 0L);
        setIntField(term289834, term289834.getClass(), "playCount", 0);
        setIntField(term289834, term289834.getClass(), "multiPlayCount", 0);
        setIntField(term289834, term289834.getClass(), "playerRating", 0);
        setIntField(term289834, term289834.getClass(), "highestRating", 0);
        setIntField(term289834, term289834.getClass(), "nameplateId", 0);
        setIntField(term289834, term289834.getClass(), "frameId", 0);
        setIntField(term289834, term289834.getClass(), "characterId", 0);
        setIntField(term289834, term289834.getClass(), "trophyId", 0);
        setIntField(term289834, term289834.getClass(), "playedTutorialBit", 0);
        setIntField(term289834, term289834.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289834, term289834.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289834, term289834.getClass(), "totalMapNum", 0);
        setLongField(term289834, term289834.getClass(), "totalHiScore", 0L);
        setLongField(term289834, term289834.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289834, term289834.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289834, term289834.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289834, term289834.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289834, term289834.getClass(), "totalUltimaHighScore", 0L);
        setField(term289834, term289834.getClass(), "eventWatchedDate", null);
        setIntField(term289834, term289834.getClass(), "friendCount", 0);
        setField(term289834, term289834.getClass(), "firstGameId", null);
        setField(term289834, term289834.getClass(), "firstRomVersion", null);
        setField(term289834, term289834.getClass(), "firstDataVersion", null);
        setField(term289834, term289834.getClass(), "firstPlayDate", null);
        setField(term289834, term289834.getClass(), "lastGameId", null);
        setField(term289834, term289834.getClass(), "lastRomVersion", null);
        setField(term289834, term289834.getClass(), "lastDataVersion", null);
        setField(term289834, term289834.getClass(), "lastLoginDate", null);
        setField(term289834, term289834.getClass(), "lastPlayDate", null);
        setIntField(term289834, term289834.getClass(), "lastPlaceId", 0);
        setField(term289834, term289834.getClass(), "lastPlaceName", null);
        setField(term289834, term289834.getClass(), "lastRegionId", null);
        setField(term289834, term289834.getClass(), "lastRegionName", null);
        setField(term289834, term289834.getClass(), "lastAllNetId", null);
        setField(term289834, term289834.getClass(), "lastClientId", null);
        setField(term289834, term289834.getClass(), "lastCountryCode", null);
        setField(term289834, term289834.getClass(), "userNameEx", null);
        setField(term289834, term289834.getClass(), "compatibleCmVersion", null);
        setIntField(term289834, term289834.getClass(), "medal", 0);
        setIntField(term289834, term289834.getClass(), "mapIconId", 0);
        setIntField(term289834, term289834.getClass(), "voiceId", 0);
        setIntField(term289834, term289834.getClass(), "avatarWear", 0);
        setIntField(term289834, term289834.getClass(), "avatarHead", 0);
        setIntField(term289834, term289834.getClass(), "avatarFace", 0);
        setIntField(term289834, term289834.getClass(), "avatarSkin", 0);
        setIntField(term289834, term289834.getClass(), "avatarItem", 0);
        setIntField(term289834, term289834.getClass(), "avatarFront", 0);
        setIntField(term289834, term289834.getClass(), "avatarBack", 0);
        setIntField(term289834, term289834.getClass(), "classEmblemBase", 0);
        setIntField(term289834, term289834.getClass(), "classEmblemMedal", 0);
        setIntField(term289834, term289834.getClass(), "stockedGridCount", 0);
        setIntField(term289834, term289834.getClass(), "exMapLoopCount", 0);
        setIntField(term289834, term289834.getClass(), "netBattlePlayCount", 0);
        setIntField(term289834, term289834.getClass(), "netBattleWinCount", 0);
        setIntField(term289834, term289834.getClass(), "netBattleLoseCount", 0);
        setIntField(term289834, term289834.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289834, term289834.getClass(), "charaIllustId", 0);
        setIntField(term289834, term289834.getClass(), "skillId", 0);
        setIntField(term289834, term289834.getClass(), "overPowerPoint", 0);
        setIntField(term289834, term289834.getClass(), "overPowerRate", 0);
        setIntField(term289834, term289834.getClass(), "overPowerLowerRank", 0);
        setIntField(term289834, term289834.getClass(), "avatarPoint", 0);
        setIntField(term289834, term289834.getClass(), "battleRankId", 0);
        setIntField(term289834, term289834.getClass(), "battleRankPoint", 0);
        setIntField(term289834, term289834.getClass(), "eliteRankPoint", 0);
        setIntField(term289834, term289834.getClass(), "netBattle1stCount", 0);
        setIntField(term289834, term289834.getClass(), "netBattle2ndCount", 0);
        setIntField(term289834, term289834.getClass(), "netBattle3rdCount", 0);
        setIntField(term289834, term289834.getClass(), "netBattle4thCount", 0);
        setIntField(term289834, term289834.getClass(), "netBattleCorrection", 0);
        setIntField(term289834, term289834.getClass(), "netBattleErrCnt", 0);
        setIntField(term289834, term289834.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289834, term289834.getClass(), "battleRewardStatus", 0);
        setIntField(term289834, term289834.getClass(), "battleRewardIndex", 0);
        setIntField(term289834, term289834.getClass(), "battleRewardCount", 0);
        setIntField(term289834, term289834.getClass(), "ext1", 0);
        setIntField(term289834, term289834.getClass(), "ext2", 0);
        setIntField(term289834, term289834.getClass(), "ext3", 0);
        setIntField(term289834, term289834.getClass(), "ext4", 0);
        setIntField(term289834, term289834.getClass(), "ext5", 0);
        setIntField(term289834, term289834.getClass(), "ext6", 0);
        setIntField(term289834, term289834.getClass(), "ext7", 0);
        setIntField(term289834, term289834.getClass(), "ext8", 0);
        setIntField(term289834, term289834.getClass(), "ext9", 0);
        setIntField(term289834, term289834.getClass(), "ext10", 0);
        setField(term289834, term289834.getClass(), "extStr1", null);
        setField(term289834, term289834.getClass(), "extStr2", null);
        setLongField(term289834, term289834.getClass(), "extLong1", 0L);
        setLongField(term289834, term289834.getClass(), "extLong2", 0L);
        setField(term289834, term289834.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289834, term289834.getClass(), "isNetBattleHost", false);
        setIntField(term289834, term289834.getClass(), "netBattleEndState", 0);
        term289911 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289911;
        callMethod(klass, "setNetBattlePlayCount", argTypes, term289834, args);
    }

};


