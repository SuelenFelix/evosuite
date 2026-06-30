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

public class UserData_setBattleRankId_205532752376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290624;
     Object term290701;

    public UserData_setBattleRankId_205532752376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290624 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290624, term290624.getClass(), "id", 0L);
        setField(term290624, term290624.getClass(), "card", null);
        setField(term290624, term290624.getClass(), "userName", null);
        setIntField(term290624, term290624.getClass(), "level", 0);
        setIntField(term290624, term290624.getClass(), "reincarnationNum", 0);
        setField(term290624, term290624.getClass(), "exp", null);
        setLongField(term290624, term290624.getClass(), "point", 0L);
        setLongField(term290624, term290624.getClass(), "totalPoint", 0L);
        setIntField(term290624, term290624.getClass(), "playCount", 0);
        setIntField(term290624, term290624.getClass(), "multiPlayCount", 0);
        setIntField(term290624, term290624.getClass(), "playerRating", 0);
        setIntField(term290624, term290624.getClass(), "highestRating", 0);
        setIntField(term290624, term290624.getClass(), "nameplateId", 0);
        setIntField(term290624, term290624.getClass(), "frameId", 0);
        setIntField(term290624, term290624.getClass(), "characterId", 0);
        setIntField(term290624, term290624.getClass(), "trophyId", 0);
        setIntField(term290624, term290624.getClass(), "playedTutorialBit", 0);
        setIntField(term290624, term290624.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290624, term290624.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290624, term290624.getClass(), "totalMapNum", 0);
        setLongField(term290624, term290624.getClass(), "totalHiScore", 0L);
        setLongField(term290624, term290624.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290624, term290624.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290624, term290624.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290624, term290624.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290624, term290624.getClass(), "totalUltimaHighScore", 0L);
        setField(term290624, term290624.getClass(), "eventWatchedDate", null);
        setIntField(term290624, term290624.getClass(), "friendCount", 0);
        setField(term290624, term290624.getClass(), "firstGameId", null);
        setField(term290624, term290624.getClass(), "firstRomVersion", null);
        setField(term290624, term290624.getClass(), "firstDataVersion", null);
        setField(term290624, term290624.getClass(), "firstPlayDate", null);
        setField(term290624, term290624.getClass(), "lastGameId", null);
        setField(term290624, term290624.getClass(), "lastRomVersion", null);
        setField(term290624, term290624.getClass(), "lastDataVersion", null);
        setField(term290624, term290624.getClass(), "lastLoginDate", null);
        setField(term290624, term290624.getClass(), "lastPlayDate", null);
        setIntField(term290624, term290624.getClass(), "lastPlaceId", 0);
        setField(term290624, term290624.getClass(), "lastPlaceName", null);
        setField(term290624, term290624.getClass(), "lastRegionId", null);
        setField(term290624, term290624.getClass(), "lastRegionName", null);
        setField(term290624, term290624.getClass(), "lastAllNetId", null);
        setField(term290624, term290624.getClass(), "lastClientId", null);
        setField(term290624, term290624.getClass(), "lastCountryCode", null);
        setField(term290624, term290624.getClass(), "userNameEx", null);
        setField(term290624, term290624.getClass(), "compatibleCmVersion", null);
        setIntField(term290624, term290624.getClass(), "medal", 0);
        setIntField(term290624, term290624.getClass(), "mapIconId", 0);
        setIntField(term290624, term290624.getClass(), "voiceId", 0);
        setIntField(term290624, term290624.getClass(), "avatarWear", 0);
        setIntField(term290624, term290624.getClass(), "avatarHead", 0);
        setIntField(term290624, term290624.getClass(), "avatarFace", 0);
        setIntField(term290624, term290624.getClass(), "avatarSkin", 0);
        setIntField(term290624, term290624.getClass(), "avatarItem", 0);
        setIntField(term290624, term290624.getClass(), "avatarFront", 0);
        setIntField(term290624, term290624.getClass(), "avatarBack", 0);
        setIntField(term290624, term290624.getClass(), "classEmblemBase", 0);
        setIntField(term290624, term290624.getClass(), "classEmblemMedal", 0);
        setIntField(term290624, term290624.getClass(), "stockedGridCount", 0);
        setIntField(term290624, term290624.getClass(), "exMapLoopCount", 0);
        setIntField(term290624, term290624.getClass(), "netBattlePlayCount", 0);
        setIntField(term290624, term290624.getClass(), "netBattleWinCount", 0);
        setIntField(term290624, term290624.getClass(), "netBattleLoseCount", 0);
        setIntField(term290624, term290624.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290624, term290624.getClass(), "charaIllustId", 0);
        setIntField(term290624, term290624.getClass(), "skillId", 0);
        setIntField(term290624, term290624.getClass(), "overPowerPoint", 0);
        setIntField(term290624, term290624.getClass(), "overPowerRate", 0);
        setIntField(term290624, term290624.getClass(), "overPowerLowerRank", 0);
        setIntField(term290624, term290624.getClass(), "avatarPoint", 0);
        setIntField(term290624, term290624.getClass(), "battleRankId", 0);
        setIntField(term290624, term290624.getClass(), "battleRankPoint", 0);
        setIntField(term290624, term290624.getClass(), "eliteRankPoint", 0);
        setIntField(term290624, term290624.getClass(), "netBattle1stCount", 0);
        setIntField(term290624, term290624.getClass(), "netBattle2ndCount", 0);
        setIntField(term290624, term290624.getClass(), "netBattle3rdCount", 0);
        setIntField(term290624, term290624.getClass(), "netBattle4thCount", 0);
        setIntField(term290624, term290624.getClass(), "netBattleCorrection", 0);
        setIntField(term290624, term290624.getClass(), "netBattleErrCnt", 0);
        setIntField(term290624, term290624.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290624, term290624.getClass(), "battleRewardStatus", 0);
        setIntField(term290624, term290624.getClass(), "battleRewardIndex", 0);
        setIntField(term290624, term290624.getClass(), "battleRewardCount", 0);
        setIntField(term290624, term290624.getClass(), "ext1", 0);
        setIntField(term290624, term290624.getClass(), "ext2", 0);
        setIntField(term290624, term290624.getClass(), "ext3", 0);
        setIntField(term290624, term290624.getClass(), "ext4", 0);
        setIntField(term290624, term290624.getClass(), "ext5", 0);
        setIntField(term290624, term290624.getClass(), "ext6", 0);
        setIntField(term290624, term290624.getClass(), "ext7", 0);
        setIntField(term290624, term290624.getClass(), "ext8", 0);
        setIntField(term290624, term290624.getClass(), "ext9", 0);
        setIntField(term290624, term290624.getClass(), "ext10", 0);
        setField(term290624, term290624.getClass(), "extStr1", null);
        setField(term290624, term290624.getClass(), "extStr2", null);
        setLongField(term290624, term290624.getClass(), "extLong1", 0L);
        setLongField(term290624, term290624.getClass(), "extLong2", 0L);
        setField(term290624, term290624.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290624, term290624.getClass(), "isNetBattleHost", false);
        setIntField(term290624, term290624.getClass(), "netBattleEndState", 0);
        term290701 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290701;
        callMethod(klass, "setBattleRankId", argTypes, term290624, args);
    }

};


