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

public class UserData_setAvatarHead_925854186356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289044;
     Object term289121;

    public UserData_setAvatarHead_925854186356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289044 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289044, term289044.getClass(), "id", 0L);
        setField(term289044, term289044.getClass(), "card", null);
        setField(term289044, term289044.getClass(), "userName", null);
        setIntField(term289044, term289044.getClass(), "level", 0);
        setIntField(term289044, term289044.getClass(), "reincarnationNum", 0);
        setField(term289044, term289044.getClass(), "exp", null);
        setLongField(term289044, term289044.getClass(), "point", 0L);
        setLongField(term289044, term289044.getClass(), "totalPoint", 0L);
        setIntField(term289044, term289044.getClass(), "playCount", 0);
        setIntField(term289044, term289044.getClass(), "multiPlayCount", 0);
        setIntField(term289044, term289044.getClass(), "playerRating", 0);
        setIntField(term289044, term289044.getClass(), "highestRating", 0);
        setIntField(term289044, term289044.getClass(), "nameplateId", 0);
        setIntField(term289044, term289044.getClass(), "frameId", 0);
        setIntField(term289044, term289044.getClass(), "characterId", 0);
        setIntField(term289044, term289044.getClass(), "trophyId", 0);
        setIntField(term289044, term289044.getClass(), "playedTutorialBit", 0);
        setIntField(term289044, term289044.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289044, term289044.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289044, term289044.getClass(), "totalMapNum", 0);
        setLongField(term289044, term289044.getClass(), "totalHiScore", 0L);
        setLongField(term289044, term289044.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289044, term289044.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289044, term289044.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289044, term289044.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289044, term289044.getClass(), "totalUltimaHighScore", 0L);
        setField(term289044, term289044.getClass(), "eventWatchedDate", null);
        setIntField(term289044, term289044.getClass(), "friendCount", 0);
        setField(term289044, term289044.getClass(), "firstGameId", null);
        setField(term289044, term289044.getClass(), "firstRomVersion", null);
        setField(term289044, term289044.getClass(), "firstDataVersion", null);
        setField(term289044, term289044.getClass(), "firstPlayDate", null);
        setField(term289044, term289044.getClass(), "lastGameId", null);
        setField(term289044, term289044.getClass(), "lastRomVersion", null);
        setField(term289044, term289044.getClass(), "lastDataVersion", null);
        setField(term289044, term289044.getClass(), "lastLoginDate", null);
        setField(term289044, term289044.getClass(), "lastPlayDate", null);
        setIntField(term289044, term289044.getClass(), "lastPlaceId", 0);
        setField(term289044, term289044.getClass(), "lastPlaceName", null);
        setField(term289044, term289044.getClass(), "lastRegionId", null);
        setField(term289044, term289044.getClass(), "lastRegionName", null);
        setField(term289044, term289044.getClass(), "lastAllNetId", null);
        setField(term289044, term289044.getClass(), "lastClientId", null);
        setField(term289044, term289044.getClass(), "lastCountryCode", null);
        setField(term289044, term289044.getClass(), "userNameEx", null);
        setField(term289044, term289044.getClass(), "compatibleCmVersion", null);
        setIntField(term289044, term289044.getClass(), "medal", 0);
        setIntField(term289044, term289044.getClass(), "mapIconId", 0);
        setIntField(term289044, term289044.getClass(), "voiceId", 0);
        setIntField(term289044, term289044.getClass(), "avatarWear", 0);
        setIntField(term289044, term289044.getClass(), "avatarHead", 0);
        setIntField(term289044, term289044.getClass(), "avatarFace", 0);
        setIntField(term289044, term289044.getClass(), "avatarSkin", 0);
        setIntField(term289044, term289044.getClass(), "avatarItem", 0);
        setIntField(term289044, term289044.getClass(), "avatarFront", 0);
        setIntField(term289044, term289044.getClass(), "avatarBack", 0);
        setIntField(term289044, term289044.getClass(), "classEmblemBase", 0);
        setIntField(term289044, term289044.getClass(), "classEmblemMedal", 0);
        setIntField(term289044, term289044.getClass(), "stockedGridCount", 0);
        setIntField(term289044, term289044.getClass(), "exMapLoopCount", 0);
        setIntField(term289044, term289044.getClass(), "netBattlePlayCount", 0);
        setIntField(term289044, term289044.getClass(), "netBattleWinCount", 0);
        setIntField(term289044, term289044.getClass(), "netBattleLoseCount", 0);
        setIntField(term289044, term289044.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289044, term289044.getClass(), "charaIllustId", 0);
        setIntField(term289044, term289044.getClass(), "skillId", 0);
        setIntField(term289044, term289044.getClass(), "overPowerPoint", 0);
        setIntField(term289044, term289044.getClass(), "overPowerRate", 0);
        setIntField(term289044, term289044.getClass(), "overPowerLowerRank", 0);
        setIntField(term289044, term289044.getClass(), "avatarPoint", 0);
        setIntField(term289044, term289044.getClass(), "battleRankId", 0);
        setIntField(term289044, term289044.getClass(), "battleRankPoint", 0);
        setIntField(term289044, term289044.getClass(), "eliteRankPoint", 0);
        setIntField(term289044, term289044.getClass(), "netBattle1stCount", 0);
        setIntField(term289044, term289044.getClass(), "netBattle2ndCount", 0);
        setIntField(term289044, term289044.getClass(), "netBattle3rdCount", 0);
        setIntField(term289044, term289044.getClass(), "netBattle4thCount", 0);
        setIntField(term289044, term289044.getClass(), "netBattleCorrection", 0);
        setIntField(term289044, term289044.getClass(), "netBattleErrCnt", 0);
        setIntField(term289044, term289044.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289044, term289044.getClass(), "battleRewardStatus", 0);
        setIntField(term289044, term289044.getClass(), "battleRewardIndex", 0);
        setIntField(term289044, term289044.getClass(), "battleRewardCount", 0);
        setIntField(term289044, term289044.getClass(), "ext1", 0);
        setIntField(term289044, term289044.getClass(), "ext2", 0);
        setIntField(term289044, term289044.getClass(), "ext3", 0);
        setIntField(term289044, term289044.getClass(), "ext4", 0);
        setIntField(term289044, term289044.getClass(), "ext5", 0);
        setIntField(term289044, term289044.getClass(), "ext6", 0);
        setIntField(term289044, term289044.getClass(), "ext7", 0);
        setIntField(term289044, term289044.getClass(), "ext8", 0);
        setIntField(term289044, term289044.getClass(), "ext9", 0);
        setIntField(term289044, term289044.getClass(), "ext10", 0);
        setField(term289044, term289044.getClass(), "extStr1", null);
        setField(term289044, term289044.getClass(), "extStr2", null);
        setLongField(term289044, term289044.getClass(), "extLong1", 0L);
        setLongField(term289044, term289044.getClass(), "extLong2", 0L);
        setField(term289044, term289044.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289044, term289044.getClass(), "isNetBattleHost", false);
        setIntField(term289044, term289044.getClass(), "netBattleEndState", 0);
        term289121 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289121;
        callMethod(klass, "setAvatarHead", argTypes, term289044, args);
    }

};


