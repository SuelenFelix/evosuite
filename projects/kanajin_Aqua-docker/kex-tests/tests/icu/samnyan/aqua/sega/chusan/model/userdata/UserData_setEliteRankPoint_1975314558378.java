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

public class UserData_setEliteRankPoint_1975314558378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290782;
     Object term290859;

    public UserData_setEliteRankPoint_1975314558378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290782 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290782, term290782.getClass(), "id", 0L);
        setField(term290782, term290782.getClass(), "card", null);
        setField(term290782, term290782.getClass(), "userName", null);
        setIntField(term290782, term290782.getClass(), "level", 0);
        setIntField(term290782, term290782.getClass(), "reincarnationNum", 0);
        setField(term290782, term290782.getClass(), "exp", null);
        setLongField(term290782, term290782.getClass(), "point", 0L);
        setLongField(term290782, term290782.getClass(), "totalPoint", 0L);
        setIntField(term290782, term290782.getClass(), "playCount", 0);
        setIntField(term290782, term290782.getClass(), "multiPlayCount", 0);
        setIntField(term290782, term290782.getClass(), "playerRating", 0);
        setIntField(term290782, term290782.getClass(), "highestRating", 0);
        setIntField(term290782, term290782.getClass(), "nameplateId", 0);
        setIntField(term290782, term290782.getClass(), "frameId", 0);
        setIntField(term290782, term290782.getClass(), "characterId", 0);
        setIntField(term290782, term290782.getClass(), "trophyId", 0);
        setIntField(term290782, term290782.getClass(), "playedTutorialBit", 0);
        setIntField(term290782, term290782.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290782, term290782.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290782, term290782.getClass(), "totalMapNum", 0);
        setLongField(term290782, term290782.getClass(), "totalHiScore", 0L);
        setLongField(term290782, term290782.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290782, term290782.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290782, term290782.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290782, term290782.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290782, term290782.getClass(), "totalUltimaHighScore", 0L);
        setField(term290782, term290782.getClass(), "eventWatchedDate", null);
        setIntField(term290782, term290782.getClass(), "friendCount", 0);
        setField(term290782, term290782.getClass(), "firstGameId", null);
        setField(term290782, term290782.getClass(), "firstRomVersion", null);
        setField(term290782, term290782.getClass(), "firstDataVersion", null);
        setField(term290782, term290782.getClass(), "firstPlayDate", null);
        setField(term290782, term290782.getClass(), "lastGameId", null);
        setField(term290782, term290782.getClass(), "lastRomVersion", null);
        setField(term290782, term290782.getClass(), "lastDataVersion", null);
        setField(term290782, term290782.getClass(), "lastLoginDate", null);
        setField(term290782, term290782.getClass(), "lastPlayDate", null);
        setIntField(term290782, term290782.getClass(), "lastPlaceId", 0);
        setField(term290782, term290782.getClass(), "lastPlaceName", null);
        setField(term290782, term290782.getClass(), "lastRegionId", null);
        setField(term290782, term290782.getClass(), "lastRegionName", null);
        setField(term290782, term290782.getClass(), "lastAllNetId", null);
        setField(term290782, term290782.getClass(), "lastClientId", null);
        setField(term290782, term290782.getClass(), "lastCountryCode", null);
        setField(term290782, term290782.getClass(), "userNameEx", null);
        setField(term290782, term290782.getClass(), "compatibleCmVersion", null);
        setIntField(term290782, term290782.getClass(), "medal", 0);
        setIntField(term290782, term290782.getClass(), "mapIconId", 0);
        setIntField(term290782, term290782.getClass(), "voiceId", 0);
        setIntField(term290782, term290782.getClass(), "avatarWear", 0);
        setIntField(term290782, term290782.getClass(), "avatarHead", 0);
        setIntField(term290782, term290782.getClass(), "avatarFace", 0);
        setIntField(term290782, term290782.getClass(), "avatarSkin", 0);
        setIntField(term290782, term290782.getClass(), "avatarItem", 0);
        setIntField(term290782, term290782.getClass(), "avatarFront", 0);
        setIntField(term290782, term290782.getClass(), "avatarBack", 0);
        setIntField(term290782, term290782.getClass(), "classEmblemBase", 0);
        setIntField(term290782, term290782.getClass(), "classEmblemMedal", 0);
        setIntField(term290782, term290782.getClass(), "stockedGridCount", 0);
        setIntField(term290782, term290782.getClass(), "exMapLoopCount", 0);
        setIntField(term290782, term290782.getClass(), "netBattlePlayCount", 0);
        setIntField(term290782, term290782.getClass(), "netBattleWinCount", 0);
        setIntField(term290782, term290782.getClass(), "netBattleLoseCount", 0);
        setIntField(term290782, term290782.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290782, term290782.getClass(), "charaIllustId", 0);
        setIntField(term290782, term290782.getClass(), "skillId", 0);
        setIntField(term290782, term290782.getClass(), "overPowerPoint", 0);
        setIntField(term290782, term290782.getClass(), "overPowerRate", 0);
        setIntField(term290782, term290782.getClass(), "overPowerLowerRank", 0);
        setIntField(term290782, term290782.getClass(), "avatarPoint", 0);
        setIntField(term290782, term290782.getClass(), "battleRankId", 0);
        setIntField(term290782, term290782.getClass(), "battleRankPoint", 0);
        setIntField(term290782, term290782.getClass(), "eliteRankPoint", 0);
        setIntField(term290782, term290782.getClass(), "netBattle1stCount", 0);
        setIntField(term290782, term290782.getClass(), "netBattle2ndCount", 0);
        setIntField(term290782, term290782.getClass(), "netBattle3rdCount", 0);
        setIntField(term290782, term290782.getClass(), "netBattle4thCount", 0);
        setIntField(term290782, term290782.getClass(), "netBattleCorrection", 0);
        setIntField(term290782, term290782.getClass(), "netBattleErrCnt", 0);
        setIntField(term290782, term290782.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290782, term290782.getClass(), "battleRewardStatus", 0);
        setIntField(term290782, term290782.getClass(), "battleRewardIndex", 0);
        setIntField(term290782, term290782.getClass(), "battleRewardCount", 0);
        setIntField(term290782, term290782.getClass(), "ext1", 0);
        setIntField(term290782, term290782.getClass(), "ext2", 0);
        setIntField(term290782, term290782.getClass(), "ext3", 0);
        setIntField(term290782, term290782.getClass(), "ext4", 0);
        setIntField(term290782, term290782.getClass(), "ext5", 0);
        setIntField(term290782, term290782.getClass(), "ext6", 0);
        setIntField(term290782, term290782.getClass(), "ext7", 0);
        setIntField(term290782, term290782.getClass(), "ext8", 0);
        setIntField(term290782, term290782.getClass(), "ext9", 0);
        setIntField(term290782, term290782.getClass(), "ext10", 0);
        setField(term290782, term290782.getClass(), "extStr1", null);
        setField(term290782, term290782.getClass(), "extStr2", null);
        setLongField(term290782, term290782.getClass(), "extLong1", 0L);
        setLongField(term290782, term290782.getClass(), "extLong2", 0L);
        setField(term290782, term290782.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290782, term290782.getClass(), "isNetBattleHost", false);
        setIntField(term290782, term290782.getClass(), "netBattleEndState", 0);
        term290859 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290859;
        callMethod(klass, "setEliteRankPoint", argTypes, term290782, args);
    }

};


